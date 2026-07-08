package com.seksimus.basicjava.module3.task5;

public class Runner {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);

            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {

        Runner runner = new Runner();

        TextAnalyzer[] analyzers = {
                new SpamAnalyzer(new String[]{"nigga", "nigger", "naga",
                        "faggot", " retard", "virgin", "simp", "incel", "cunt"
                }),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(100)
        };

        System.out.println(runner.checkLabels(analyzers, "hello my nigga"));
        System.out.println(runner.checkLabels(analyzers, "god morning"));
        System.out.println(runner.checkLabels(analyzers, "placi placi :("));
        System.out.println(runner.checkLabels(analyzers, "son of whore :)"));
        System.out.println(runner.checkLabels(analyzers, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"));
    }
}
