package com.seksimus.basicjava.module6.Task8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String randomFrom = "Random From";
        String randomTo = "Random To";
        int randomSalary = 100;

        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        MailMessage secondMessage = new MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, " +
                        "когда практически все сценарии написал я. Так не честно!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        List<MailMessage> messages = Arrays.asList(
                firstMessage,
                secondMessage,
                thirdMessage
        );

        MailService<String> mailService = new MailService<>();

        messages.stream().forEachOrdered(mailService);

        Map<String, List<String>> mailBox = mailService.getMailBox();

        System.out.println(mailBox.get("H.P. Lovecraft"));
        System.out.println(mailBox.get("Christopher Nolan"));
        System.out.println(mailBox.get(randomTo));


        Salary salary1 =
                new Salary("Facebook", "Mark Zuckerberg", 1);

        Salary salary2 =
                new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);

        Salary salary3 =
                new Salary(randomFrom, randomTo, randomSalary);

        MailService<Integer> salaryService = new MailService<>();

        Arrays.asList(
                salary1,
                salary2,
                salary3
        ).forEach(salaryService);

        Map<String, List<Integer>> salaries =
                salaryService.getMailBox();

        System.out.println(salaries.get(salary1.getTo()));
        System.out.println(salaries.get(salary2.getTo()));
        System.out.println(salaries.get(randomTo));
    }
}