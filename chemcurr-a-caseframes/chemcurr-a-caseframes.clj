
;;; A

(defineCaseframe 'Proposition '('Ako subclass superclass)
  :docstring "Every [subclass] is a [superclass]")

(defineCaseframe 'ILO '('actions analysandum)
  :docstring "Analyse [analysandum]"
  :fsymbols '(AnalyseILO))

;;; B

;;; C

(defineCaseframe 'ILO '(actions object-of-calculation)
    :docstring "Calculate [object-of-calculation]",
    :fsymbols '(CalculateILO))

;;; D

(defineCaseframe 'ILO '(actions definable-thing)
  :docstring "Define [definable-thing]"
  :fsymbols '(DefineILO))

(defineCaseframe 'ILO '(actions describable-thing)
  :docstring "Describe [describable-thing]"
  :fsymbols '(DescribeILO))

(defineCaseframe 'Proposition '(Domain domain-predicate domain)
      :docstring "[domain-predicate] applies to [domain]")
      :fsymbols '(InTermsOf))


;;; E

;;; F

;;; G

;;; H

(defineCaseframe 'Proposition '('hasClassName nameable-class class-name)
  :docstring "[namable-class] has [class-name]")

(defineCaseframe 'Proposition '(hasName nameable-thing thing-name)
  :docstring "[nameable-thing] has [thing-name]"
  :fsymbols '(hasSystematicName hasIupacName hasIupacNameSubstitutive 
              hasIupacNameAdditive hasAcceptableCommonName hasPreferredIupacName 
              hasGeneralIupacName hasRetainedIupacName hasTrivialName hasAtomName 
              hasElementName hasMoleculeName hasSubstanceName hasOtherName))

(defineCaseframe 'Proposition '('hasQuantity thing-with-quantity quantity)
  :docstring "[thing-with-quantity] has [quantity]")

;;; I

;;; J

;;; K

;;; L

;;; M

;;; N

;;; O

;;; P

;;; Q

;;; R

;;; S

;;; T

;;; U

(defineCaseframe 'ILO '(actions instrument)
  :docstring "Use [instrument]"
  :fsymbols '(UseILO))

;;; V

;;; W

;;; X

;;; Y

;;; Z
