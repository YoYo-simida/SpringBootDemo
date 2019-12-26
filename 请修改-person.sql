-- Create table
create table PERSON
(
  person_no NUMBER(5),
  name      VARCHAR2(30),
  sex       VARCHAR2(2),
  birthday  DATE
);

-- 测试记录
INSERT INTO person(person_no, NAME, sex, birthday)
VALUES(1, '小游子', '女', DATE '2019-01-01');

-- 存储过程
CREATE OR REPLACE PROCEDURE pro_person(v_person_no IN system.person.person_no%TYPE,
                                       v_flag      OUT VARCHAR2) AS
   v_count NUMBER(2) := 0;
   CURSOR cur_person IS
      SELECT COUNT(1) FROM person p WHERE p.person_no = v_person_no;
BEGIN

   OPEN cur_person;

   FETCH cur_person
      INTO v_count;

   IF v_count >= 1 THEN
      v_flag := '调用成功';
   END IF;

   CLOSE cur_person;

EXCEPTION
   WHEN OTHERS THEN
      v_flag := '调用失败';
      dbms_output.put_line(SQLERRM);
END pro_person;
