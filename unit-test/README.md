# Bài tập thực hành kiểm thử với JUnit  
## Chủ đề: Phân tích dữ liệu điểm số học sinh

---

## Mô tả bài toán

Chương trình Java **StudentAnalyzer** cung cấp các phương thức để phân tích điểm số học sinh.

### 1 `countExcellentStudents(List<Double> scores)`

**Mục đích**  
Đếm số lượng học sinh đạt loại **Giỏi** (điểm ≥ 8.0).

**Quy tắc xử lý**
- Chỉ chấp nhận điểm hợp lệ trong khoảng **[0, 10]**
- Bỏ qua điểm `null`, điểm âm hoặc > 10
- Trả về **0** nếu danh sách rỗng hoặc `null`

---

### 2️⃣ `calculateValidAverage(List<Double> scores)`

**Mục đích**  
Tính **điểm trung bình** của các điểm hợp lệ.

**Quy tắc xử lý**
- Chỉ tính các điểm trong khoảng **[0, 10]**
- Bỏ qua điểm không hợp lệ
- Trả về **0.0** nếu danh sách rỗng, `null` hoặc không có điểm hợp lệ

---

## 📁 Cấu trúc thư mục dự án

```
unit-test/
├── src/
│   └── com/example/unit_test/
│       └── StudentAnalyzer.java
├── test/
│   └── com/example/unit_test/
│       └── StudentAnalyzerTest.java
├── pom.xml
└── README.md
```

---

## Hướng dẫn chạy chương trình

### Yêu cầu hệ thống
- Java **JDK 17** hoặc cao hơn  
- Apache **Maven 3.8+**

###  Kiểm tra phiên bản
```bash
java -version
mvn -version
```

###  Biên dịch dự án
```bash
mvn compile
```

###  Chạy kiểm thử đơn vị
```bash
mvn test
```

### Kết quả mong đợi
```text
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

---

## Danh sách Test Cases

# Test cho `countExcellentStudents()`

| STT | Tên Test Case | Mô tả | Kết quả mong đợi |
|----|---------------|-------|------------------|
| 1 | NormalCase | Có điểm hợp lệ và không hợp lệ | 2 |
| 2 | AllValid | Tất cả điểm hợp lệ | 4 |
| 3 | EmptyList | Danh sách rỗng | 0 |
| 4 | BoundaryValues | Chỉ chứa 0 và 10 | 1 |
| 5 | InvalidValuesOnly | Toàn bộ điểm không hợp lệ | 0 |

---

# Test cho `calculateValidAverage()`

| STT | Tên Test Case | Mô tả | Kết quả mong đợi |
|----|---------------|-------|------------------|
| 1 | NormalCase | Có điểm hợp lệ và không hợp lệ | 8.17 |
| 2 | AllValid | Tất cả điểm hợp lệ | 7.0 |
| 3 | EmptyList | Danh sách rỗng | 0.0 |
| 4 | BoundaryValues | Chỉ chứa 0 và 10 | 5.0 |
| 5 | InvalidValuesOnly | Toàn bộ điểm không hợp lệ | 0.0 |

---

## Phạm vi kiểm thử

- Kiểm thử giá trị hợp lệ  
- Kiểm thử giá trị biên  
- Kiểm thử dữ liệu không hợp lệ  
- Kiểm thử danh sách rỗng  
- Kiểm thử độ chính xác số thực (±0.01)




