package com.example.metruyenchu.controller;

import com.example.metruyenchu.constant.SystemConstant;
import com.example.metruyenchu.service.imp.IBookViewService;
import com.example.metruyenchu.service.imp.IViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TrackViewController {

    private IViewService viewService;
    private IBookViewService bookViewService;
    @Autowired
    public TrackViewController(IViewService viewService,
                               IBookViewService bookViewService) {
        this.viewService = viewService;
        this.bookViewService = bookViewService;
    }

    @PutMapping("/books/track-view/like/{bookId}")
    public void trackViewLike(@PathVariable("bookId") Long bookId) {
        bookViewService.trackViews(bookId, SystemConstant.TRACK_VIEW_LIKE);
    }
    @PutMapping("/books/track-view/trend/{bookId}")
    public void trackViewTrend(@PathVariable("bookId") Long bookId) {
        bookViewService.trackViews(bookId, SystemConstant.TRACK_VIEW_TREND);
    }

}
