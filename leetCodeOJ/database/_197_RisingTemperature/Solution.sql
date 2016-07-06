SELECT
  w1.id AS Id
FROM
  Weather AS w1
  INNER JOIN Weather AS w2
    ON TO_DAYS(w1.date) - TO_DAYS(w2.date) = 1
WHERE
  w1.temperature > w2.temperature
;
