# json-tst

A benchmark on reading json and converting the data to clojure data structure
using https://github.com/hugoduncan/criterium for benchmarking.

using clojure 1.3.0

json data is read from big.json

before each run : 
lein clean, compile  :all

## clojure.data.json 
   lein run  data.json

### result
   **using clojure.data.json 0.1.1**

    Evaluation count             : 60
    Execution time mean : 3.274831 sec  95.0% CI: (3.274521 sec, 3.275357 sec)
    Execution time std-deviation : 55.233039 ms  95.0% CI: (54.429857 ms, 55.879924 ms)
    Execution time lower ci : 3.223011 sec  95.0% CI: (3.223011 sec, 3.223011 sec)
    Execution time upper ci : 3.386837 sec  95.0% CI: (3.386837 sec, 3.386837 sec)

    Found 4 outliers in 60 samples (6.6667 %)
    low-severe   1 (1.6667 %)
    low-mild  3 (5.0000 %)
    Variance from outliers : 6.2598 % Variance is slightly inflated by outliers


   **using clojure.data.json 0.1.2**

    Evaluation count             : 3600
    Execution time mean : 16.931168 ms  95.0% CI: (16.928364 ms, 16.934429 ms)
    Execution time std-deviation : 415.701749 us  95.0% CI: (410.639713 us, 421.625691 us)
    Execution time lower ci : 16.662583 ms  95.0% CI: (16.662583 ms, 16.662583 ms)
    Execution time upper ci : 17.511079 ms  95.0% CI: (17.494767 ms, 17.511079 ms)

    Found 5 outliers in 60 samples (8.3333 %)
    low-severe   1 (1.6667 %)
    low-mild  4 (6.6667 %)
    Variance from outliers : 12.5653 % Variance is moderately inflated by outliers


## clj-json with keywords = true

   lein run  clj-json

### result 
  **using clj-json 0.5.0**

    Evaluation count             : 7560
    Execution time mean : 7.956903 ms  95.0% CI: (7.955531 ms, 7.958117 ms)
    Execution time std-deviation : 191.216267 us  95.0% CI: (188.717861 us, 193.589299 us)
    Execution time lower ci : 7.843302 ms  95.0% CI: (7.842362 ms, 7.843302 ms)
    Execution time upper ci : 8.216397 ms  95.0% CI: (8.216397 ms, 8.224537 ms)

    Found 7 outliers in 60 samples (11.6667 %)
    low-severe   4 (6.6667 %)
    low-mild  3 (5.0000 %)
    Variance from outliers : 11.0529 % Variance is moderately inflated by outliers


## clj-json with keywords false, structure is keywordized with walk/post
   
   lein run clj-json-post

### result 
  **using clj-json 0.5.0**

    Evaluation count             : 1620
    Execution time mean : 38.489912 ms  95.0% CI: (38.486400 ms, 38.493275 ms)
    Execution time std-deviation : 424.065122 us  95.0% CI: (419.864369 us, 429.906871 us)
    Execution time lower ci : 38.007000 ms  95.0% CI: (38.007000 ms, 38.007000 ms)
    Execution time upper ci : 38.921185 ms  95.0% CI: (38.921185 ms, 38.926272 ms)

    Found 2 outliers in 60 samples (3.3333 %)
    low-severe   1 (1.6667 %)
    low-mild  1 (1.6667 %)
    Variance from outliers : 1.6389 % Variance is slightly inflated by outliers

## License

Copyright (C) 2012 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
