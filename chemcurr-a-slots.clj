;;; A

(defineSlot Act :type :Thing)
(defineSlot analysandum :type :Thing)
(defineSlot AnalyseILO :type :Thing)
(defineSlot AscertainILO :type :Thing)

;;; B

(defineSlot beam-constituent :type :Thing)

;;; C

(defineSlot CalculateILO :type :Thing)
(defineSlot CarryOut :type :Thing)
(defineSlot class-name :type :Name)
(defineSlot content :type :Thing)
(defineSlot Circumstance :type :Thing)
(defineSlot circumstances :type :Thing)


;;; D

(defineSlot DeduceHowILO :type :Thing)
(defineSlot DeduceILO :type :Thing)
(defineSlot definable-thing :type :Thing)
(defineSlot DeriveILO :type :Thing)
(defineSlot describable-thing :type :Thing)
(defineSlot DetermineILO :type :Thing)
(defineSlot Do :type :Thing)
(defineSlot Domain :type :Thing)
(defineSlot domain :type :Thing)
(defineSlot domain-predicate :type :Thing)

;;; E

(defineSlot entity-with-circumstances :type :Thing)
(defineSlot ExecuteILO :type :Thing)

;;; F

(defineSlot FigureOutILO :type :Thing)

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

(defineSlot identifiable-thing :type :Thing)
(defineSlot IdentifyILO :type :Thing)
(defineSlot inChemicalSystem :type :Thing)
(defineSlot inCircumstances :type :Thing)
(defineSlot InferILO :type :Thing)
(defineSlot inSystem :type :Thing)
(defineSlot IntentionallyAct :type :Thing)
(defineSlot inRelationTo :type :Thing)
(defineSlot inTermsOf :type :Thing)

;;; J

;;; K

;;; L

(defineSlot locality-of-distribution :type :Thing)

;;; M

;;; N

(defineSlot nameable-class :type :Category)
(defineSlot nameable-thing :type :NameableThing)

;;; O

(defineSlot object-of-calculation :type :Thing)

;;; P

(defineSlot Perform :type :Thing)
(defineSlot pure-chemical-substance-name :type :Thing)
(defineSlot PuzzleOutILO :type :Thing)

;;; Q

(defineSlot quantity :type :Quantity)

;;; R

;;; S

(defineSlot shape :type :Thing)
(defineSlot shape-property :type :Thing)


(defineSlot subclass :type Category :negadjust reduce
            :path (compose ! subclass (kstar (compose superclass- ! subclass)))
            :docstring "Subcategories of some category/ies.")

(defineSlot superclass :type Category :negadjust reduce
            :path (compose ! superclass (kstar (compose subclass- ! superclass)))
            :docstring "Supercategories of some category/ies.")
(defineSlot SurmiseILO :type :Name)

;;; T

(defineSlot thing-in-presence :type :Thing)
(defineSlot thing-name :type :Name)
(defineSlot thing-with-behavior :type :Thing)
(defineSlot thing-with-distribution :type :Thing)
(defineSlot thing-with-presence :type :Thing)
(defineSlot thing-with-quantity :type :Thing)
(defineSlot thing-with-shape :type :Thing)

;;; U

;;; V

;;; W

(defineSlot withParticularReferenceTo :type :Thing)
(defineSlot withReferenceTo :type :Thing)
(defineSlot withRegardsTo :type :Thing)
(defineSlot WorkOutILO :type :Thing)
(defineSlot writable :type :Thing)

;;; X

;;; Y

;;; Z

(defineCaseframe 'Proposition '('hasShapeProperty shape shape-property)
     :docstring "[shape] has [shape-property]")



