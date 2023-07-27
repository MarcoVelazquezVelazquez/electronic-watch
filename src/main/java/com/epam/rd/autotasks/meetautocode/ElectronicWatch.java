package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        //int convertToHours = seconds / 3600;
        int convertToHours = (seconds / 3600) % 24;
        int convertToMinutes = (seconds % 3600) / 60;
        int convertToSeconds = seconds % 60;

        System.out.printf("%d:%02d:%02d", convertToHours, convertToMinutes, convertToSeconds);
    }
}
