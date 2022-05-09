package com.company;

enum silnik{
    Disel , Benzynowy;
}


abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected silnik rodzajSilnika;
}
