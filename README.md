Dưới đây là toàn bộ nội dung đã được định dạng chuẩn Markdown bên trong khối mã (code block). Bạn chỉ cần bấm vào nút **Copy code** ở góc trên bên phải của khung dưới đây là có thể dán trực tiếp vào file `README.md` của mình trên GitHub:

```markdown
# Đánh giá và Kiểm thử Phần mềm - Thực hành Kiểm thử Hộp trắng

## Mô tả Dự án

Dự án này thực hiện các kỹ thuật kiểm thử hộp trắng (white-box testing) sử dụng Java và JUnit 5. Dự án bao gồm 8 chương trình thực hành cùng với các ca kiểm thử (test cases) toàn diện, được thiết kế nhằm đạt độ bao phủ mã nguồn cao (**100% statement coverage** - bao phủ câu lệnh và **100% branch coverage** - bao phủ nhánh).

## Các Chương trình Đã Triển khai

### 1. Hình chữ nhật (Rectangle)
- `Rectangle.calculatePerimeter(length, width)` - Tính chu vi hình chữ nhật
- `Rectangle.calculateArea(length, width)` - Tính diện tích hình chữ nhật
- **Số nhánh (Branches)**: 2 (kiểm tra tính hợp lệ của đầu vào)
- **Ca kiểm thử (Test Cases)**: 17 ca

### 2. Phương trình bậc 2 (Quadratic Equation)
- `QuadraticEquation.solve(a, b, c)` - Giải phương trình ax² + bx + c = 0
- **Số nhánh**: 8 (a=0, delta >0, =0, <0)
- **Ca kiểm thử**: 24 ca
- **Độ bao phủ**: Phương trình có hai nghiệm phân biệt, nghiệm kép, vô nghiệm thực, phương trình bậc nhất, vô số nghiệm.

### 3. Tính số ngày của một tháng (Month Days)
- `MonthDays.getDaysInMonth(month, year)` - Lấy số ngày trong một tháng
- **Số nhánh**: 12 tháng + logic tính năm nhuận
- **Ca kiểm thử**: 25 ca
- **Độ bao phủ**: Tất cả các tháng, quy tắc năm nhuận (chia hết cho 400, 100, 4).

### 4. Kiểm tra số nguyên tố (Prime Number)
- `PrimeNumber.isPrime(n)` - Kiểm tra xem n có phải là số nguyên tố không
- **Số nhánh**: 4 (n=2, số chẵn, tìm thấy ước số, kết thúc vòng lặp)
- **Ca kiểm thử**: 38 ca
- **Độ bao phủ**: Số nguyên tố, số chẵn, hợp số lẻ, các trường hợp biên.

### 5. Tính tổng đan dấu (Alternating Sum)
- `AlternatingSum.calculateSum(n)` - Tính tổng S = 1 - 2 + 3 - 4 + ... + n
- **Số nhánh**: 2 (quy luật chẵn/lẻ)
- **Ca kiểm thử**: 21 ca
- **Độ bao phủ**: Các giá trị biên, xác minh theo quy luật.

### 6. Ước chung lớn nhất (GCD)
- `GCD.findGCD(a, b)` - Tìm ƯCLN bằng thuật toán Euclid
- **Số nhánh**: 1 vòng lặp (while b != 0)
- **Ca kiểm thử**: 24 ca
- **Độ bao phủ**: Bội số, hai số nguyên tố cùng nhau, thứ tự đảo ngược, các trường hợp biên.

### 7. Tính tổng giai thừa (Factorial Sum)
- `FactorialSum.factorial(n)` - Tính giai thừa của n
- `FactorialSum.calculateSumOfFactorials(n)` - Tính tổng S = 1! + 2! + 3! + ... + n!
- **Số nhánh**: 2 (trường hợp đặc biệt n=0/1, vòng lặp)
- **Ca kiểm thử**: 29 ca
- **Độ bao phủ**: Các trường hợp cơ sở, các bước lặp, tính cộng dồn.

## Cấu trúc Dự án

```text
Buoi 4.1/
├── pom.xml                  # Cấu hình Maven
├── README.md                # File hướng dẫn này
├── TEST_CASES.md            # Tài liệu chi tiết về các ca kiểm thử
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/testing/
│   │           ├── Rectangle.java
│   │           ├── QuadraticEquation.java
│   │           ├── MonthDays.java
│   │           ├── PrimeNumber.java
│   │           ├── AlternatingSum.java
│   │           ├── GCD.java
│   │           └── FactorialSum.java
│   └── test/
│       └── java/
│           └── com/testing/
│               ├── RectangleTest.java
│               ├── QuadraticEquationTest.java
│               ├── MonthDaysTest.java
│               ├── PrimeNumberTest.java
│               ├── AlternatingSumTest.java
│               ├── GCDTest.java
│               └── FactorialSumTest.java
└── target/                  # Thư mục chứa kết quả build
    └── coverage/            # Báo cáo độ bao phủ mã nguồn của JaCoCo
```

## Các Yêu cầu Đã Đạt Được

✓ **Triển khai bằng Java**: Tất cả các bài toán đều được viết bằng Java.  
✓ **Cấu trúc Rõ ràng**: Mã nguồn được chia thành các class/phương thức riêng biệt.  
✓ **Kiểm thử JUnit**: Sử dụng bộ kiểm thử JUnit 5 toàn diện.  
✓ **Phân tích Mã nguồn**: Xác định rõ các câu lệnh và nhánh logic.  
✓ **Độ bao phủ Cao**: Nhắm tới mục tiêu 100% bao phủ câu lệnh và 100% bao phủ nhánh.  
✓ **Tích hợp GitHub**: Mã nguồn đã được đẩy (push) lên kho lưu trữ.  

## Mục tiêu Bao phủ của Kiểm thử

Mỗi bộ kiểm thử (test suite) được thiết kế nhằm mục đích:

1. **Bao phủ câu lệnh - Statement Coverage (100%)**: Mọi dòng lệnh thực thi đều được chạy qua ít nhất một lần.
2. **Bao phủ nhánh - Branch Coverage (100%)**: Mọi nhánh điều kiện đều được kiểm tra cho cả hai trường hợp Đúng (True) và Sai (False).
3. **Các trường hợp biên (Edge Cases)**: Kiểm tra các giá trị biên, đầu vào không hợp lệ và các trường hợp đặc biệt.
4. **Xử lý Ngoại lệ (Exception Handling)**: Xác thực tính hợp lệ của đầu vào và các điều kiện gây ra lỗi.

## Thống kê Kiểm thử

| Chương trình | Số Ca Kiểm thử | Câu lệnh | Số Nhánh |
|---------|-----------|-----------|----------|
| Hình chữ nhật (Rectangle) | 17 | 10 | 2 |
| Phương trình bậc 2 (QuadraticEquation) | 24 | 30+ | 8 |
| Số ngày trong tháng (MonthDays) | 25 | 20+ | 13 |
| Số nguyên tố (PrimeNumber) | 38 | 10+ | 4 |
| Tổng đan dấu (AlternatingSum) | 21 | 5+ | 2 |
| Ước chung lớn nhất (GCD) | 24 | 8+ | 2 |
| Tổng giai thừa (FactorialSum) | 29 | 15+ | 4 |
| **TỔNG CỘNG** | **178** | **98+** | **35+** |

## Hướng dẫn Chạy Kiểm thử

### Yêu cầu Hệ thống (Prerequisites)
- Java 11 trở lên
- Maven 3.6.0 trở lên

### Chạy Toàn bộ Kiểm thử
```bash
mvn clean test
```

### Chạy một Lớp Kiểm thử Cụ thể
```bash
mvn test -Dtest=RectangleTest
mvn test -Dtest=QuadraticEquationTest
```

### Tạo Báo cáo Độ bao phủ (Coverage Report)
```bash
mvn clean test jacoco:report
```
*Báo cáo sẽ được tạo tại đường dẫn:* `target/site/jacoco/index.html`

### Chạy Kiểm thử với Log Chi tiết
```bash
mvn test -X
```

## Phương pháp Thiết kế Ca Kiểm thử

### 1. Các Luồng xử lý Hợp lệ (Issue 1)
- Các trường hợp sử dụng thông thường với dữ liệu đầu vào hợp lệ.
- Xác minh kết quả đầu ra đúng như mong đợi.
- Xác minh tính đúng đắn của các thuật toán.

### 2. Các Nhánh lỗi & Trường hợp Biên (Issue 2)
- Kiểm thử các giá trị biên.
- Xử lý các đầu vào không hợp lệ.
- Các điều kiện biên của vòng lặp.
- Các kịch bản ném ngoại lệ (Exception).
- Kiểm thử các nhánh logic điều kiện.

## Các Issue trên GitHub

### Issue 1: Kiểm thử Hộp trắng cho Các luồng Xử lý Hợp lệ
Bao gồm các ca kiểm thử cho:
- Kích thước hình chữ nhật thông thường hợp lệ.
- Phương trình bậc 2 có nghiệm thực.
- Số ngày của tất cả các tháng trong năm.
- Các số nguyên tố.
- Tính toán chuỗi tổng đan dấu.
- Các phép tính ƯCLN.
- Các phép tính chuỗi tổng giai thừa.

### Issue 2: Kiểm thử Hộp trắng cho Các nhánh Lỗi & Trường hợp Biên
Bao gồm các ca kiểm thử cho:
- Đầu vào không hợp lệ (giá trị bằng 0, số âm).
- Các điều kiện biên.
- Xử lý ngoại lệ (Exception).
- Các trường hợp đặc biệt (năm nhuận, số chính phương, v.v.).
- Ranh giới của các vòng lặp.
- Các nhánh điều kiện.

## Chất lượng Mã nguồn

- **Ngôn ngữ**: Java 11
- **Framework Kiểm thử**: JUnit 5
- **Công cụ Đo độ bao phủ**: JaCoCo
- **Công cụ Build**: Maven
- **Phong cách Code (Code Style)**: Tuân thủ các quy chuẩn viết code của Java (Java conventions).

## Cách tiếp cận Kiểm thử Hộp trắng

Mỗi lớp kiểm thử được xây dựng để xác định và kiểm tra:

1. **Câu lệnh (Statements)**: Mọi dòng code có thể thực thi.
2. **Nhánh (Branches)**: Tất cả các luồng rẽ nhánh điều kiện (if/else, switch).
3. **Vòng lặp (Loops)**: Điểm bắt đầu, các vòng lặp lặp lại, và điều kiện thoát.
4. **Ngoại lệ (Exceptions)**: Các điều kiện lỗi và việc ném ra ngoại lệ.

## Ghi chú của Tác giả

Dự án này minh họa các kỹ thuật thực hành kiểm thử hộp trắng một cách toàn diện, tập trung vào:
- Bao phủ hoàn toàn các nhánh logic.
- Phân tích các giá trị biên.
- Kiểm thử các ngoại lệ có thể xảy ra.
- Kiểm tra các điều kiện ranh giới của vòng lặp.
- Xác minh chặt chẽ các logic điều kiện.

## Giấy phép (License)

Đây là dự án giáo dục phục vụ cho môn học Kiểm thử Phần mềm.

## Tài liệu Tham khảo

- Tài liệu JUnit 5: https://junit.org/junit5/docs/current/user-guide/
- Độ bao phủ mã nguồn Java (JaCoCo): https://www.eclemma.org/jacoco/
- Kiểm thử Hộp trắng (White-Box Testing): https://en.wikipedia.org/wiki/White-box_testing
```