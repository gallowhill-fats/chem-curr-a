;;; A

(defineSlot AccountFor :type :Thing)
(defineSlot Act :type :Thing)
(defineSlot analysandum :type :Thing)
(defineSlot AnalyseILO :type :Thing)
(defineSlot ApplyILO :type :Thing)
(defineSlot AscertainILO :type :Thing)
(defineSlot assumption-set :type :Thing)

;;; B

(defineSlot base :type :Thing)
(defineSlot BasedOn :type :Thing)
(defineSlot Basing :type :Thing)
(defineSlot beam-constituent :type :Thing)
(defineSlot BuiltOn :type :Thing)

;;; C

(defineSlot CalculateILO :type :Thing)
(defineSlot CarryOut :type :Thing)
(defineSlot chemical-property :type :ChemicalProperty)
(defineSlot Circumstance :type :Thing)
(defineSlot circumstances :type :Thing)
(defineSlot circumstances-of-use :type :Thing)
(defineSlot class-name :type :Name)
(defineSlot class-with-physical-properties :type :Category)
(defineSlot class-with-properties :type :Category)
(defineSlot comparative-aspect :type :Comparative)
(defineSlot comparative-thing :type :Thing)
(defineSlot comparative-sense :type :Thing)
(defineSlot CompareILO :type :Thing)
(defineSlot comparison-set :type :Thing)
(defineSlot ConstructedOn :type :Thing)
(defineSlot Containing :type :Thing)
(defineSlot content :type :Thing)



;;; D

(defineSlot DeduceHowILO :type :Thing)
(defineSlot DeduceILO :type :Thing)
(defineSlot definable-thing :type :Thing)
(defineSlot dependent-entity :type :Entity)
(defineSlot DeriveILO :type :Thing)
(defineSlot describable-thing :type :Thing)
(defineSlot DetermineILO :type :Thing)
(defineSlot Do :type :Thing)
(defineSlot Domain :type :Thing)
(defineSlot domain :type :Thing)
(defineSlot domain-predicate :type :Thing)

;;; E

(defineSlot EmployILO :type :Thing)
(defineSlot entity-with-base :type :Entity)
(defineSlot entity-with-circumstances :type :Entity)
(defineSlot entity-with-explanation :type :Entity)
(defineSlot essential-for :type :Thing)
(defineSlot essential-thing :type :Thing)
(defineSlot ExecuteILO :type :Thing)
(defineSlot Explain :type :Thing)
(defineSlot ExplainWhy :type :Thing)
(defineSlot ExplainTerm :type :Thing)
(defineSlot ExplainAndUseTerm :type :Thing)


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
(defineSlot Including :type :Thing)
(defineSlot inclusion-set :type :Entity)
(defineSlot InferILO :type :Thing)
(defineSlot influencing-entity :type :Entity)
(defineSlot Incorporating :type :Thing)
(defineSlot instrument :type :Thing)
(defineSlot Integrating :type :Thing)
(defineSlot IntentionallyAct :type :Thing)
(defineSlot inRelationTo :type :Thing)
(defineSlot inSystem :type :Thing)
(defineSlot inTermsOf :type :Thing)

;;; J

;;; K

;;; L


(defineSlot locality-of-distribution :type :Thing)


;;; M

(defineSlot MatchILO :type :Thing)

;;; N

(defineSlot nameable-class :type :Category)
(defineSlot nameable-thing :type :NameableThing)
(defineSlot non-physical-property :type :NonPhysicalProperty)

;;; O

(defineSlot ObjectiveInfluence :type :Thing)
(defineSlot object-of-action :type :Thing)
(defineSlot object-of-calculation :type :Thing)
(defineSlot OperateILO :type :Thing)

;;; P

(defineSlot Perform :type :Thing)
(defineSlot physical-property :type :PhysicalProeprty)
(defineSlot property :type :Property)
(defineSlot ProposeILO :type :Thing)
(defineSlot pure-chemical-substance-name :type :Name)
(defineSlot purpose :type :Thing)
(defineSlot PuzzleOutILO :type :Thing)

;;; Q

(defineSlot quantity :type :Quantity)

;;; R

(defineSlot reactive-entity :type :ChemicalReferent)
(defineSlot RecountILO :type :Thing)
(defineSlot RelateILO :type :Thing)
(defineSlot ReportILO :type :Thing)

;;; S

(defineSlot shape :type :Thing)
(defineSlot shape-property :type :Thing)
(defineSlot Smaller :type :Thing)
(defineSlot stabilised-thing :type :Thing)
(defineSlot stabilisation-agency :type :Thing)
(defineSlot statable-thing :type :Thing)
(defineSlot StateILO :type :Thing)


(defineSlot subclass :type Category :negadjust reduce
            :path (compose ! subclass (kstar (compose superclass- ! subclass)))
            :docstring "Subcategories of some category/ies.")

(defineSlot SuggestILO :type :Thing)

(defineSlot superclass :type Category :negadjust reduce
            :path (compose ! superclass (kstar (compose subclass- ! superclass)))
            :docstring "Supercategories of some category/ies.")
(defineSlot SurmiseILO :type :Thing)

;;; T

(defineSlot thing-in-presence :type :Thing)
(defineSlot thing-name :type :Name)
(defineSlot thing-to-be-determined :type :Thing)
(defineSlot thing-with-behavior :type :Thing)
(defineSlot thing-with-change :type :Thing)
(defineSlot thing-with-distribution :type :Thing)
(defineSlot thing-with-presence :type :Thing)
(defineSlot thing-with-property :type :Thing)
(defineSlot thing-with-quantity :type :Thing)
(defineSlot thing-with-shape :type :Thing)
(defineSlot topic :type :Thing)
(defineSlot type-of-action :type :Thing)
(defineSlot type-of-alteration :type :Thing)


;;; U

;;; V

;;; W

(defineSlot withParticularReferenceTo :type :Thing)
(defineSlot withReferenceTo :type :Thing)
(defineSlot withRegardsTo :type :Thing)
(defineSlot WorkOutILO :type :Thing)
(defineSlot writable :type :Thing)
(defineSlot WriteDownILO :type :Thing)
(defineSlot WriteILO :type :Thing)

;;; X

;;; Y

;;; Z








