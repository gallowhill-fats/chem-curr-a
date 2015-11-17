;;; A

(defineSlot analysandum :type :Thing)
(defineSlot AnalyseILO :type :Thing)

;;; B

;;; C

(defineSlot CalculateILO :type :Thing)
(defineSlot class-name :type :Name)

;;; D

(defineSlot definable-thing :type :Thing)
(defineSlot describable-thing :type :Thing)
(defineSlot Domain :type :Thing)
(defineSlot domain :type :Thing)
(defineSlot domain-predicate :type :Thing)

;;; E

;;; F

;;; G

;;; H

(defineSlot hasAcceptableCommonName :type :Thing)
(defineSlot hasAtomName :type :Thing)
(defineSlot hasChemicalName :type :Thing)
(defineSlot hasElementName :type :Thing)
(defineSlot hasGeneralIupacname :type :Thing)
(defineSlot hasIupacName :type :Thing)
(defineSlot hasIupacNameSubstitutive :type :Thing)
(defineSlot hasIupacNameAdditive :type :Thing)
(defineSlot hasMoleculeName :type :Thing)
(defineSlot hasName :type :Thing)
(defineSlot hasOtherName :type :Thing)
(defineSlot hasPreferredIupacName :type :Thing)
(defineSlot hasRetainedIupacName :type :Thing)
(defineSlot hasSubstanceName :type :Thing)
(defineSlot hasSystematicName :type :Thing)



;;; I

(defineSlot InTermsOf :type :Thing)

;;; J

;;; K

;;; L

;;; M

;;; N

(defineSlot nameable-class :type :Category)
(defineSlot nameable-thing :type :NameableThing)

;;; O

(defineSlot object-of-calculation :type :Thing)

;;; P

(defineSlot pure-chemical-substance-name :type :Thing)

;;; Q

(defineSlot quantity :type :Quantity)

;;; R

;;; S

(defineSlot subclass :type Category :negadjust reduce
            :path (compose ! subclass (kstar (compose superclass- ! subclass)))
            :docstring "Subcategories of some category/ies.")

(defineSlot superclass :type Category :negadjust reduce
            :path (compose ! superclass (kstar (compose subclass- ! superclass)))
            :docstring "Supercategories of some category/ies.")

;;; T

(defineSlot thing-name :type :Name)
(defineSlot thing-with-quantity :type :Thing)

;;; U

;;; V

;;; W

;;; X

;;; Y

;;; Z
