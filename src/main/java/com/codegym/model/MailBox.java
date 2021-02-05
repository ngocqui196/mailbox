package com.codegym.model;

public class MailBox {
    private String language;
    private int size;
    private boolean spamfilter;
    private String signature;

    public MailBox() {
    }

    public MailBox(String language, int size, boolean spamfilter, String signature) {
        this.language = language;
        this.size = size;
        this.spamfilter = spamfilter;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSpamfilter() {
        return spamfilter;
    }

    public void setSpamfilter(boolean spamfilter) {
        this.spamfilter = spamfilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
