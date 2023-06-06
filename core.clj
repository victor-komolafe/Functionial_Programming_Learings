;;solving random simultaneous equations where x is a list from 1-10

;;question 1
;;5x^2 + x + 64 = 0
(defn quadratic [a b c x]
  (+ (* a x x) (* b x) c))

(defn solve-quadratic [a b c]
  (for [x (range 1 11)]
    (quadratic a b c x)))


(solve-quadratic 5 1 64)


;;question 2 solution;
;;f(x) = (3x+5)(4x-2)
(defn expression [x]
  (* (+ (* 3 x) 5) (- (* 4 x) 2)))

(defn solve-expression [f x-values]
  (map f x-values))

(solve-expression expression (range 1 11))

;;question 3 solution;
;; 12x^2 = 25x
(defn quadratic [a b c]
  (let [discriminant (- (* b b) (* 4 a c))]
    (if (>= discriminant 0)
      [(/ (- (* -1 b) (Math/sqrt discriminant)) (* 2 a))
       (/ (+ (* -1 b) (Math/sqrt discriminant)) (* 2 a))]
      nil)))
(quadratic 12 -25 0)
