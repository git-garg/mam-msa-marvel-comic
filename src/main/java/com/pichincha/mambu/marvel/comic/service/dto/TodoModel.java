package com.pichincha.mambu.marvel.comic.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoModel {

    private String userId;
    private int id;
    private String title;
    private boolean completed;

}
