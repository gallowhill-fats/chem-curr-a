;;; chemical referent classes
(assert '(Ako "chemical substance class*" "chemical referent class*"))
(assert '(Ako "pure chemical substance class*" "chemical substance class*"))
(assert '(Ako "chemical species class*" "pure chemical substance class*"))
(assert '(Ako "element class*" "chemical species class*"))
(assert '(Ako "chemical entity class*" "chemical referent class*"))
(assert '(Ako "atomic chemical entity class*" "chemical entity class*"))
(assert '(Ako "molecular chemical entity class*" "chemical entity class*"))
(assert '(Ako "monatomic entity class*" "chemical entity class*"))
(assert '(Ako "polyatomic entity class*" "chemical entity class*"))
;;; inorganics
(assert '(Ako "inorganic pure chemical substance class*" "pure chemical substance class*"))
 (assert '(Ako "inorganic salt substance class*" "inorganic pure chemical substance class*"))
 (assert '(Ako "coordination compound substance class*" "inorganic pure chemical substance class*"))
 (assert '(Ako "inorganic oxide substance class*" "inorganic pure chemical substance class*"))
(assert '(Ako "inorganic molecular chemical entity class*" "molecular chemical entity class*"))
 (assert '(Ako "coordination compound molecular entity class*" "inorganic molecular chemical entity class*"))
 (assert '(Ako "inorganic salt molecular entity class*" "inorganic molecular chemical entity class*"))
 (assert '(Ako "inorganic oxide molecular entity class*" "inorganic molecular chemical entity class*"))
;;; ionic referents
 (assert '(Ako "ionic chemical entity class*" "chemical entity class*"))
 (assert '(Ako "anionic chemical entity class*" "ionic chemical entity class*"))
 (assert '(Ako "cationic chemical entity class*" "ionic chemical entity class*"))
 (assert '(Ako "metal cation class*" "cationic chemical entity class"))
 (assert '(Ako "alkali metal cation class*" "metal cation class"))
 (assert '(Ako "alkaline earth metal cation class*" "metal cation class"))

 

