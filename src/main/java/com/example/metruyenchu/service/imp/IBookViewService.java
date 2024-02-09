package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IBookViewConvert;
import com.example.metruyenchu.dto.BookViewDto;
import com.example.metruyenchu.entity.BookView;
import com.example.metruyenchu.repository.BookViewRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class IBookViewService implements GenericCRUDService<BookViewDto> {

    private BookViewRepository bookViewRepository;
    private IBookViewConvert bookViewConvert;
    @Autowired
    public IBookViewService(BookViewRepository bookViewRepository,
                            IBookViewConvert bookViewConvert) {
        this.bookViewRepository = bookViewRepository;
        this.bookViewConvert = bookViewConvert;
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

    public void trackView() {
        List<BookView> bookViews = GenericService.recordOfList(bookViewRepository);
        bookViews.stream().forEach((bookView) -> {
            /**
             * date[0]:corresponding <->day</->
             * data[1]:corresponding <->month</->
             * data[2]:corresponding <->month</->
             */
            boolean[] date = {false, false, false};
            setIsExpires(date, bookView);
            saveData(bookViewConvert.toDto(bookView));
        });
    }

    private void setIsExpires(boolean[] date, BookView view) {
        LocalDateTime day = view.getDay();
        LocalDateTime week = view.getWeek();
        LocalDateTime month = view.getMonth();
        LocalDateTime now = LocalDateTime.now();
        if(now.getDayOfMonth() - day.getDayOfMonth() >= 1) {
            date[0] = true;
            view.setDay(LocalDateTime.now());
        }
        if(now.getDayOfMonth() - week.getDayOfMonth() >= 7) {
            date[1] = true;
            view.setWeek(LocalDateTime.now());
        }
        if(now.getDayOfYear() - month.getDayOfYear() >= 31) {
            date[2] = true;
            view.setMonth(LocalDateTime.now());
        }
    }
}
