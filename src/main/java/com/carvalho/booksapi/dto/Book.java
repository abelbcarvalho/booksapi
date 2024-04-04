package com.carvalho.booksapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Data
public class Book {
    private BigInteger id = new BigInteger("0");
    private string name;
    private string author;
    private string publisher = null;
    private int numPages = 0;
    private int yearPublish = 0;
}
