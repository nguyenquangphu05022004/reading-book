package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.dto.CategoryDto;
import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.entity.Author;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component public class IBookConvert implements GenericConvert<Book, BookDto> {


    private ICategoryConvert categoryConvert;
    private IAuthorConvert authorConvert;
    private IChapterConvert chapterConvert;
    private IEvaluationConvert evaluationConvert;
    private ICommentConvert commentConvert;
    @Autowired
    public IBookConvert(ICategoryConvert categoryConvert,
                        IAuthorConvert authorConvert,
                        IChapterConvert chapterConvert,
                        IEvaluationConvert evaluationConvert,
                        ICommentConvert commentConvert) {
        this.categoryConvert = categoryConvert;
        this.authorConvert = authorConvert;
        this.chapterConvert = chapterConvert;
        this.evaluationConvert = evaluationConvert;
        this.commentConvert =commentConvert;
    }

    @Override
    public Book toEntity(BookDto bookDto) {

        Set<Category> categories = new HashSet<>(categoryConvert.
                toEntity(bookDto.getCategories().stream().toList()));
        Book book = Book.builder()
                .bookNameVn(bookDto.getBookNameVn())
                .bookNameEn(bookDto.getBookNameEn())
                .shortDescription(bookDto.getShortDescription())
                .thumbnail(bookDto.getThumbnail())
                .categories(categories)
                .author(Author.builder()
                        .id(bookDto.getAuthorDto().getId()).build())
                .build();
        return book;
    }

    @Override
    public BookDto toDto(Book book) {

        Set<CategoryDto> categoryDtos = new HashSet<>(categoryConvert
                .toDto(book.getCategories().stream().toList()));
        Set<ChapterDto> chapterDtos = new HashSet<>();
        if(book.getChapters() != null) {
            chapterDtos = new HashSet<>(chapterConvert
                    .toDto(book.getChapters().stream().toList()));
        }
        BookDto bookDto = BookDto.builder()
                .bookNameEn(book.getBookNameEn())
                .bookNameVn(book.getBookNameVn())
                .thumbnail(book.getThumbnail())
                .shortDescription(book.getShortDescription())
                .id(book.getId())
                .categories(categoryDtos)
                .authorDto(authorConvert.toDto(book.getAuthor()))
                .chapters(chapterDtos)
                .evaluations(evaluationConvert.toDto(book.getEvaluations()))
                .commentDtos(commentConvert.toDto(book.getComments()))
                .build();
        return bookDto;
    }

    @Override
    public Book toEntity(Book book, BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto toDto(BookDto bookDto, Book book) {
        return null;
    }
}
