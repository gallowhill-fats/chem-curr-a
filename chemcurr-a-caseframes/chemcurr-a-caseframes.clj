
;;; A

(defineCaseframe 'Proposition '('Ako subclass superclass)
  :docstring "Every [subclass] is a [superclass]")

(defineCaseframe 'ILO '('actions analysandum)
  :docstring "Analyse [analysandum]"
  :fsymbols '(AnalyseILO))

;;; B

(defineCaseframe 'Thing '('BeamOf beam-constituent)
  :docstring "a beam of [beam-constituent]s")

(defineCaseframe 'Thing '('BehaviorOf thing-with-behavior)
  :docstring "behavior of [thing-with-behavior]")

;;; C

(defineCaseframe 'ILO '(actions object-of-calculation)
    :docstring "Calculate [object-of-calculation]",
    :fsymbols '(CalculateILO))

(defineCaseframe 'Proposition '(Circumstance entity-with-circumstances circumstances)
    :docstring "[entity-with-circumstances] takes place in [circumstances]"
    :fsymbols '(inCircumstances inSystem inChemicalSystem))

;;; D

(defineCaseframe 'ILO '(actions definable-thing)
  :docstring "Define [definable-thing]"
  :fsymbols '(DefineILO))

(defineCaseframe 'ILO '(actions describable-thing)
  :docstring "Describe [describable-thing]"
  :fsymbols '(DescribeILO))

(defineCaseframe 'ILO '(actions content)
    :docstring "deduce [content]"
    :fsymbols '(DeduceILO  WorkOutILO DeriveILO AscertainILO DetermineILO FigureOutILO InferILO PuzzleOutILO SurmiseILO DeduceHowILO))

(defineCaseframe 'Thing '('DistributionOf thing-with-distribution locality-of-distribution)
  :docstring "the distribution of [thing-with-distribution] over [locality-of-distribution]")

(defineCaseframe 'Proposition '(Domain domain-predicate domain)
  :docstring "[domain-predicate] relates to, refers to, is expressed in terms belonging to [domain]"
  :fsymbols '(inTermsOf inRelationTo withReferenceTo withRegardsTo withParticularReferenceTo))


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

(defineCaseframe 'Proposition '('hasShape thing-with-shape shape)
     :docstring "[thing-with-shape] has [shape]")

(defineCaseframe 'Proposition '('hasShapeProperty shape shape-property)
     :docstring "[shape] has [shape-property]")

;;; I

(defineCaseframe 'ILO '(actions identifiable-thing)
    :docstring "identify [identifiable-thing]"
    :fsymbols '(IdentifyILO))

(defineCaseframe 'ILO '(actions act)
  :docstring "intentionally carry out [act]"
  :fsymbols '(IntentionallyActILO ActILO CarryOutILO PerformILO DoILO ExecuteILO))

(defineCaseframe 'Proposition '('inPresenceOf thing-in-presence thing-with-presence)
  :docstring "[thing-in-presence] is in presence of [thing-with-presence]")

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

(defineCaseframe 'Thing '('ShapeOf thing-with-shape)
     :docstring "shape of a [thing-with-shape]")

;;; T

;;; U

(defineCaseframe 'ILO '(actions instrument)
  :docstring "Use [instrument]"
  :fsymbols '(UseILO))

;;; V

;;; W

(defineCaseframe 'ILO '(actions writable)
    :docstring "write [writable]"
    :fsymbols '(WriteILO))

;;; X

;;; Y

;;; Z
