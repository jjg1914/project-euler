(def fib
  (memoize (fn [n]
    (cond
      (= n 0) 0
      (= n 1) 1
      :else (+ (fib (- n 1)) (fib (- n 2)))
    )
  ))
)

(->> (range)
     (take-while (fn [x] (< (fib x) 4000000)))
     (map (fn [x] (fib x)))
     (filter (fn [x] (= (mod x 2) 0)))
     (reduce +)
)
