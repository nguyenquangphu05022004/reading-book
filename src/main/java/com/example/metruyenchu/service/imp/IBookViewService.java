package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IBookViewConvert;
import com.example.metruyenchu.dto.BookViewDto;
import com.example.metruyenchu.entity.BookView;
import com.example.metruyenchu.repository.BookViewRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class IBookViewService implements GenericCRUDService<BookViewDto> {

    private BookViewRepository bookViewRepository;
    private IBookViewConvert bookViewConvert;
    private IViewService viewService;
    @Autowired
    public IBookViewService(BookViewRepository bookViewRepository,
                            IBookViewConvert bookViewConvert,
                            IViewService viewService) {
        this.bookViewRepository = bookViewRepository;
        this.bookViewConvert = bookViewConvert;
        this.viewService = viewService;
    }

    @Override
    public BookViewDto saveData(BookViewDto data) {
        return GenericService.saveData(
                data,data.getId(), bookViewConvert,
                BookView.class, bookViewRepository
        );
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<BookViewDto> recordOfList() {
        return null;
    }

    @Transactional
    public void trackViews(Long bookId, Long bookViewCategoryId) {
        List<BookView> bookViews = bookViewRepository.findAll();
        boolean[] date = {false, false, false};
        setIsExpiresAndViews(date, bookViews, bookId, bookViewCategoryId);
    }


    private void setIsExpiresAndViews(boolean[] date, List<BookView> bookViews,
                              Long bookId, Long bookViewCategoryId) {
        bookViews.stream().forEach((view) -> {
            LocalDateTime day = view.getDay();
            LocalDateTime week = view.getWeek();
            LocalDateTime month = view.getMonth();
            LocalDateTime now = LocalDateTime.now();
            if (now.getDayOfMonth() - day.getDayOfMonth() >= 1 && now.getHour() - day.getHour() >= 0) {
                date[0] = true;
                view.setDay(LocalDateTime.now());
            }
            if (now.getDayOfMonth() - week.getDayOfMonth() >= 7 && now.getHour() - week.getHour() >= 0) {
                date[1] = true;
                view.setWeek(LocalDateTime.now());
            }
            if (now.getDayOfYear() - month.getDayOfYear() >= 31 && now.getHour() - month.getHour() >= 0) {
                date[2] = true;
                view.setMonth(LocalDateTime.now());
            }
            if(view.getBook().getId() == bookId) {
                setViews(date, view, bookViewCategoryId);
            }
            saveData(bookViewConvert.toDto(view));
        });
    }

    private void setViews(boolean[] date, BookView bookView, Long bookViewCategoryId) {
        viewService.trackViews(date, bookView.getId(), bookViewCategoryId);
    }
}
