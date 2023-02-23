package com.pradipta.bookmarkerapi.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkDTO toDto(Bookmark bookmark) {
        BookmarkDTO bookmarkDTO = new BookmarkDTO();
        bookmarkDTO.setId(bookmark.getId());
        bookmarkDTO.setTitle(bookmark.getTitle());
        bookmarkDTO.setUrl(bookmark.getUrl());
        bookmarkDTO.setCreatedAt(bookmark.getCreatedAt());
        return bookmarkDTO;
    }
}
