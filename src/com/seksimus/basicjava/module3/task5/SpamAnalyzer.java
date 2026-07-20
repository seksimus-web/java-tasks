package com.seksimus.basicjava.module3.task5;

public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }
}
