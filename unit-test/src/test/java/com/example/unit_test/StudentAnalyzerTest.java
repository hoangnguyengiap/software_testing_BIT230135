package com.example.unit_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // Trường hợp bình thường: có cả điểm hợp lệ và không hợp lệ
    @Test
    public void testCountExcellentStudents_NormalCase() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp bình thường: tất cả điểm hợp lệ
    @Test
    public void testCountExcellentStudents_AllValid() {
        List<Double> scores = Arrays.asList(8.0, 8.5, 9.0, 10.0);
        assertEquals(4, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp biên: danh sách rỗng
    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    // Trường hợp biên: chỉ chứa 0 và 10
    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(1, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp ngoại lệ: toàn bộ điểm không hợp lệ
    @Test
    public void testCountExcellentStudents_InvalidValuesOnly() {
        List<Double> scores = Arrays.asList(-2.0, 11.0, 20.0);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    /*TEST calculateValidAverage */

    // Trường hợp bình thường: có cả hợp lệ và không hợp lệ
    @Test
    public void testCalculateValidAverage_NormalCase() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }

    // Trường hợp bình thường: tất cả hợp lệ
    @Test
    public void testCalculateValidAverage_AllValid() {
        List<Double> scores = Arrays.asList(6.0, 7.0, 8.0);
        assertEquals(7.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    // Trường hợp biên: danh sách rỗng
    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);
    }

    // Trường hợp biên: chỉ chứa 0 và 10
    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    // Trường hợp ngoại lệ: toàn bộ điểm không hợp lệ
    @Test
    public void testCalculateValidAverage_InvalidValuesOnly() {
        List<Double> scores = Arrays.asList(-5.0, 15.0);
        assertEquals(0, analyzer.calculateValidAverage(scores), 0.01);
    }
}
