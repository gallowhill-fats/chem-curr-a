;;; isomers

(assert 'Proposition '(HasClassName "isomer type class*" "types of isomer"))
(assert 'Proposition '(HasClassName "isomer type class*" "isomers"))

(assert 'Proposition '(HasClassMemberName "isomer type class*" "type of isomer"))
(assert 'Proposition '(HasClassMemberName "isomer type class*" "isomer"))

(assert 'Proposition '(HasClassName "geometric isomer class*" "geometric isomers"))
(assert 'Proposition '(HasClassMemberName "geometric isomer class*" "geometric isomer"))

(assert 'Proposition '(HasClassName "optical isomer class*" "optical isomers"))
(assert 'Proposition '(HasClassName "optical isomer class*" "stereoisomers"))
(assert 'Proposition '(HasClassMemberName "optical isomer class*" "optical isomer"))
(assert 'Proposition '(HasClassMemberName "optical isomer class*" "stereoisomer"))

(assert 'Proposition '(HasClassName "diastereomer isomer class*" "diastereomers"))
(assert 'Proposition '(HasClassMemberName "diasteromer isomer class*" "diastereomer"))

(assert 'Proposition '(Ako  "geometric isomer class*" "isomer type class*"))
(assert 'Proposition '(IAko "optical  isomer class*" "isomer type class*"))
(assert 'Proposition '(IAko "diastereomer  isomer class*" "isomer type class*"))
