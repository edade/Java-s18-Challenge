package com.workintech.demo.dto;

public record BookResponse(long id,String name,String categoryName,AuthorResponse authorResponse) {
}