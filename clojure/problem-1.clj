(->> (range 1 1000)
     (filter (fn [x] (or (= (mod x 3) 0) (= (mod x 5) 0))))
     (reduce +)
)
