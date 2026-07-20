package com.seksimus.basicjava.module3.task5;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    @Override
    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();



    protected abstract Label getLabel();


}


