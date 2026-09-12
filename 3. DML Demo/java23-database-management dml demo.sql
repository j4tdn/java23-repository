USE java23_company_management;

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
  FROM t02_project
 WHERE YEAR(C02_START_DATE) = 2024
   AND C02_REVENUE > 50000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
SELECT t03.C03_EMPLOYEE_ID EMPLOYEE_ID,
	   t03.C03_EMPLOYEE_NAME EMPLOYEE_NAME,
       GROUP_CONCAT(concat(t04.C04_PROJECT_ID, ':', t04.C04_WORKING_HOURS) SEPARATOR ', ') PROJECT_HOUR_DETAILS,
       SUM(t04.C04_WORKING_HOURS) WORKING_HOURS   
  FROM t03_employee t03
  JOIN t04_project_management t04
    ON t03.C03_EMPLOYEE_ID = t04.C04_EMPLOYEE_ID
 GROUP BY t03.C03_EMPLOYEE_ID,
          t03.C03_EMPLOYEE_NAME;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
SELECT C03_EMPLOYEE_ID, C03_EMPLOYEE_NAME, C03_SALARY, C03_MANAGER_ID FROM t03_employee;

SELECT *
  FROM t03_employee emp
  JOIN t03_employee man
    ON emp.C03_MANAGER_ID = man.C03_EMPLOYEE_ID
 WHERE emp.C03_SALARY > man.C03_SALARY;

--  4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
