package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IChapterConvert;
import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.dto.NotificationDto;
import com.example.metruyenchu.entity.Chapter;
import com.example.metruyenchu.entity.Notification;
import com.example.metruyenchu.repository.BookRepository;
import com.example.metruyenchu.repository.ChapterRepository;
import com.example.metruyenchu.repository.NotificationRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class IChapterService implements GenericCRUDService<ChapterDto> {

    private ChapterRepository chapterRepository;
    private IChapterConvert iChapterConvert;
    private BookRepository bookRepository;
    private NotificationRepository notificationRepository;
    @Autowired
    public IChapterService(ChapterRepository chapterRepository,
                           IChapterConvert iChapterConvert,
                           BookRepository bookRepository,
                           NotificationRepository notificationRepository) {
        this.chapterRepository = chapterRepository;
        this.iChapterConvert = iChapterConvert;
        this.bookRepository = bookRepository;
        this.notificationRepository = notificationRepository;
    }

    @Override
    @Transactional
    public ChapterDto saveData(ChapterDto data) {

        ChapterDto chapterDto = GenericService.saveData(
                data, data.getId(), iChapterConvert,
                Chapter.class, chapterRepository
        );

        setMessageNotification(chapterDto);
        return chapterDto;

    }


    @Override
    public void delete(Long id) {
        GenericService.deleteById(chapterRepository, id);
    }

    @Override
    public List<ChapterDto> recordOfList() {
        return GenericService.recordOfList(chapterRepository, iChapterConvert);
    }


    private void setMessageNotification(ChapterDto chapterDto) {
        List<Notification> notifications = notificationRepository.
                findAllByBookIdAndAndHasNotificated(
                        chapterDto.getBookDto().getId(),
                        true);

        notifications =
                notifications.stream().map(noti -> {
                    StringBuilder builder = new StringBuilder();
                    builder.append(noti.getBook().getBookNameVn());
                    builder.append(" vừa ra chương mới nhất: " +
                            noti.getBook().getChapters().size());
                    noti.setMessage(builder.toString());
                    return noti;
                }).toList();

        notificationRepository.saveAll(notifications);


    }

}
