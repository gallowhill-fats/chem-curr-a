;;; analysing

(defineType :Analysable (:Thing))
(defineType :Aspect (:Thing))

;;; bonding

(defineType :Bonding (:Thing))

;;; number
(defineType :Number (:Thing))
(defineType :Real (:Number))
(defineType :Float (:Real))
(defineType :Rational (:Real))
(defineType :Integer (:Rational))

;;; collections

(defineType :Collection (:Thing))

;;; chemical types
(defineType :ChemicalReferent (:Thing))
(defineType :IonicChemicalReferent (:ChemicalReferent))
(defineType :AnionicChemicalReferent (:IonicChemicalReferent))
(defineType :CationicChemicalReferent (:IonicChemicalReferent))
(defineType :ChemicalEntity (:ChemicalReferent))
(defineType :ChemicalSubstance (:ChemicalReferent))
(defineType :PureChemicalSubstance (:ChemicalSubstance))
(defineType :ChemicalSpecies (:PureChemicalSubstance))
(defineType :Element (:ChemicalSpecies))
(defineType :ChemicalEntity (:ChemicalReferent))
(defineType :AtomicChemicalEntity (:ChemicalEntity))
(defineType :MolecularChemicalEntity (:ChemicalEntity))
(defineType :IonicChemicalEntity (:ChemicalEntity))
(defineType :AnionicChemicalEntity (:IonicChemicalEntity))
(defineType :CationicChemicalEntity (:IonicChemicalEntity))

;;; chemical reaction

(defineType :Change (:Thing))
(defineType :ChemicalChange (:Change))
(defineType :ChemicalReaction (:Thing))
(defineType :RedoxReaction (:ChemicalReaction))
(defineType :HalfReaction (:ChemicalReaction))


;;; chemical equation

(defineType :ChemicalEquation (:Thing))

;;; comparatives

(defineType :Comparative (:Thing))
(defineType :GreaterComparative (:Comparative))
(defineType :SmallerComparative (:Comparative))

;;; ILOs

(defineType :ILO (:Act))

;;; naming
(defineType :Name (:Thing))
(defineType :NameableThing (:Thing))

;;; properties and quantities

(defineType :ChemicalProperty (:Property))
(defineType :NonPhysicalProperty (:Property))
(defineType :NominalProperty (:Property))
(defineType :PhysicalProperty (:Property))
(defineType :PhysicalProperties (:Category))
(defineType :Properties (:Category))
(defineType :Property (:Thing))
(defineType :Quantity (:DefinableThing))



;;; State

(defineType :State (:Thing))
(defineType :PhysicalState (:State))
(defineType :ChangeOfState (:Thing))

;;; Process

(defineType :Process (:Thing))
(defineType :PhysicalProcess (:Process))
(defineType :ChemicalProcess (:Process))




;;; UseOf

(defineType :UseAndCircumstance (:Thing))

;;; type of chemical reaction

(defineType :ReactionType (:Thing))

;;; Means

(defineType :Means (:Thing))

;;; Defining

(defineType :DefinableThing (:Thing))

;;; fundamental constants

(defineType :FundamentalConstant (:DefinableThing))

;;; Modifier

(defineType :Modifier (:Thing))

;;; subatomic particle

(defineType :SubatomicParticle (:DefinableThing))

;;; electrochem

(defineType :Electrode (:DefinableThing))
(defineType :ElectrodePotential (:DefinableThing))

;;; statistics

(defineType :ProbabilityDistribution (:DefinableThing))











