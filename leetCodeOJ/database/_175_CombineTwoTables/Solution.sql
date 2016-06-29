SELECT
  p.firstname AS FirstName,
  p.lastname  AS LastName,
  a.city      AS City,
  a.state     AS State
FROM
  Person AS p
  LEFT JOIN Address AS a
    ON p.personid = a.personid
;
