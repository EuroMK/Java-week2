SELECT *
FROM tflStations -- 410 rows

SELECT *
FROM tflBikeusage -- 21,200 rows

-- Q1 How many bike stations in Finsbury?

SELECT *
FROM tflStations
WHERE name LIKE '%Finsbury' -- 4 rows

SELECT *
FROM tflStations

SELECT *
FROM tflBikeusage

-- INNER JOIN

SELECT * 
FROM tflStations AS STA 
INNER JOIN tflBikeusage as USAG 
ON STA.id = USAG.StationID -- 19,080 rows

SELECT * 
FROM tflStations AS STA 
LEFT OUTER JOIN tflBikeusage as USAG 
ON STA.id = USAG.StationID -- 19,481 rows

SELECT * 
FROM tflBikeusage AS USAG 
LEFT OUTER JOIN tflStations as STA 
ON STA.id = USAG.StationID -- 21,200 rows

SELECT * 
FROM tflStations AS STA 
LEFT OUTER JOIN tflBikeusage as USAG 
ON STA.id = USAG.StationID
WHERE USAG.StationID IS NULL -- 401 rows with bike usage data

SELECT * 
FROM tflBikeusage AS USAG 
RIGHT OUTER JOIN tflStations as STA 
ON STA.id = USAG.StationID -- 19,481 rows

-- All the bike usage even if there's no station

SELECT * 
FROM tflBikeusage AS BIKE 
LEFT OUTER JOIN tflStations AS STN
ON STN.ID = BIKE.StationID -- 21,200 rows
WHERE STN.ID IS NULL -- 2,120 rows

SELECT * 
FROM tflStations AS STA 
FULL OUTER JOIN tflBikeusage as USAG 
ON STA.id = USAG.StationID -- 21,601