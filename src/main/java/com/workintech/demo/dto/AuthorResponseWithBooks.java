package com.workintech.demo.dto;

import java.util.List;

public record AuthorResponseWithBooks(List<BookResponse> responseList) {
}