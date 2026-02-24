# Kiểm thử hiệu năng với Apache JMeter

## 1. Thông tin chung

- Môn học: Kiểm thử phần mềm
- Công cụ: Apache JMeter 5.6.3
- Website kiểm thử: https://www.example.com
- Mục tiêu: Đánh giá hiệu năng hệ thống thông qua Response Time, Throughput và Error Rate

---

## 2. Cấu hình kiểm thử

### Thread Group 1 – Basic Load

- Number of Threads: 10
- Ramp-up Period: 10 giây
- Loop Count: 5
- Hành vi:
  - GET /

---

### Thread Group 2 – Heavy Load

- Number of Threads: 50
- Ramp-up Period: 30 giây
- Loop Count: 3
- Hành vi:
  - GET /
  - GET /

---

### Thread Group 3 – Custom Scenario

- Number of Threads: 20
- Scheduler: Bật
- Duration: 60 giây
- Constant Timer: 1000ms
- Hành vi:
  - GET /
  - GET /
  - GET /

---

## 3. Kết quả kiểm thử

### TG_01 – Basic Load

- Average Response Time: 47 ms
- Throughput: 0.03083 requests/sec
- Error Rate: 0.000%

Nhận xét:
Hệ thống phản hồi nhanh và ổn định ở mức tải cơ bản, không phát sinh lỗi.

---

### TG_02 – Heavy Load

- Average Response Time: 47 ms
- Throughput: 4.58227 requests/sec
- Error Rate: 0.237%

Nhận xét:
Khi số lượng người dùng đồng thời tăng lên, thời gian phản hồi của hệ thống vẫn duy trì ổn định. Một số lỗi 404 xuất hiện do yêu cầu tới tài nguyên không tồn tại, không phải do hệ thống quá tải

---

### TG_03 – Custom Scenario

- Average Response Time: 42 ms
- Throughput: 16.36700 requests/sec
- Error Rate: 0.616%

Nhận xét:
Trong kịch bản mô phỏng người dùng thực tế (có độ trễ giữa các request), hệ thống vẫn duy trì tốc độ phản hồi tốt. Một số lỗi nhỏ xuất hiện do request không hợp lệ.

---

## 4. Kết luận

- Website có khả năng xử lý tốt ở nhiều mức tải khác nhau.
- Response Time ổn định (trung bình 42–47 ms).
- Throughput tăng khi số lượng người dùng tăng.
- Error Rate thấp và chủ yếu do cấu hình đường dẫn không tồn tại.

---

## 5. Tài liệu đính kèm

- File JMeter: performance_test_example.jmx
- File kết quả:
  - TG01.csv
  - TG02.csv
  - TG03.csv
- Screenshot Summary Report trong thư mục screenshots/

---

## 6. Lưu ý

Bài kiểm thử được thực hiện với số lượng request hợp lý nhằm tránh vi phạm chính sách sử dụng của website.