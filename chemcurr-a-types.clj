;;; Chemistry

(defineType :Chemistry (:Thing))

;;; analysing

(defineType :Analysable (:Thing))
(defineType :Aspect (:Thing))

;;; bonding

(defineType :Bonding (:Thing))
(defineType :ChemicalBond (:Thing))
(defineType :CovalentBond (:ChemicalBond))

;;; intermolecular forces

(defineType :Force (:Thing))
(defineType :IntermolecularForce (:Force))



;;; number
(defineType :Number (:Thing))
(defineType :Real (:Number))
(defineType :Float (:Real))
(defineType :Rational (:Real))
(defineType :Integer (:Rational))
(defineType :WholeNumber (:Integer))

(defineType :NamedCardinalGroup (:Thing))

(defineType :Ordinal (:Thing))

;;; collections

(defineType :Collection (:Thing))

;;; chemical types
(defineType :ChemicalReferent (:Thing))
(defineType :ChemicalReferentClass (:Category))
(defineType :IonicChemicalReferent (:ChemicalReferent))
(defineType :AnionicChemicalReferent (:IonicChemicalReferent))
(defineType :CationicChemicalReferent (:IonicChemicalReferent))
(defineType :ChemicalEntity (:ChemicalReferent))
(defineType :ChemicalSubstance (:ChemicalReferent))
(defineType :OxideSubstance (:ChemicalSubstance))
(defineType :ChemicalSubstanceClass (:Category))
(defineType :PureChemicalSubstance (:ChemicalSubstance))
(defineType :ChemicalSpecies (:PureChemicalSubstance))
(defineType :Element (:ChemicalSpecies))
(defineType :ChemicalEntity (:ChemicalReferent))
(defineType :AtomicChemicalEntity (:ChemicalEntity))
(defineType :MolecularChemicalEntity (:ChemicalEntity))
(defineType :IonicChemicalEntity (:ChemicalEntity))
(defineType :AnionicChemicalEntity (:IonicChemicalEntity))
(defineType :CationicChemicalEntity (:IonicChemicalEntity))

(defineType :Solution (:ChemicalSubstance))

(defineType :Metal (:ChemicalSubstance))
(defineType :NonMetal (:ChemicalSubstance))

(defineType :ComplexIon (:IonicChemicalReferent))
(defineType :MetalIon (:IonicChemicalReferent))

(defineType :ToxicThing (:ChemicalReferent))

(defineType :PolymerSubstance (:ChemicalSubstance))

(defineType :OxideSubstance (:ChemicalSubstance))
(defineType :ChlorideSubstance (:ChemicalSubstance))
(defineType :BromideSubstance (:ChemicalSubstance))
(defineType :FluorideSubstance (:ChemicalSubstance))
(defineType :IodideSubstance (:ChemicalSubstance))

(defineType :NitrateSubstance (:ChemicalSubstance))
(defineType :CarbonateSubstance (:ChemicalSubstance))
(defineType :HydroxideSubstance (:ChemicalSubstance))
(defineType :SulfateSubstance (:ChemicalSubstance))

(defineType :ChemicalReagent (:ChemicalSubstance))

;;; structure

(defineType :ChemicalStructure (:Thing))

;;; periodic table

(defineType :PeriodicTablePosition (:Thing))
(defineType :PeriodicTableColumn (:Thing))
(defineType :PeriodicTableRow (:Thing))

(defineType :NobleGas (:Element))

;;; formulas

(defineType :Formula (:Thing))
(defineType :ChemicalFormula (:Formula))

(defineType :ChemicalFormulaType (:Thing))
(defineType :FormulaTypeClass (:Category))

;;; structure

(defineType :Structure (:Thing))
(defineType :MolecularStructure (:Structure))

;;; isomers 

(defineType :Isomer (:Thing))
(defineType :IsomerType (:Thing))


;;; chemical reaction

(defineType :Change (:Thing))
(defineType :ChemicalChange (:Change))
(defineType :ChemicalReaction (:Change))
(defineType :ReversibleReaction (:ChemicalReaction))

(defineType :ZeroOrderChemicalReaction (:ChemicalReaction))
(defineType :FirstOrderChemicalReaction (:ChemicalReaction))
(defineType :SecondOrderChemicalReaction (:ChemicalReaction))

(defineType :Feasibility (:Thing)) ; reaction property?

;; organic reaction types
(defineType :SubstitutionReaction (:ChemicalReaction))
(defineType :ElectrophilicSubstitutionReaction (:SubstitutionReaction))
(defineType :ElectrophilicAromaticSubstitutionReaction (:SubstitutionReaction))
(defineType :NucleophilicAliphaticSubstitutionReaction (:SubstitutionReaction))
(defineType :NucleophilicAromaticSubstitutionReaction (:SubstitutionReaction))
(defineType :NucleophilicAcylSubstitutionReaction (:SubstitutionReaction))
(defineType :RadicalSubstitutionReaction (:SubstitutionReaction :FreeRadicalReaction))
(defineType :EliminationReaction (:ChemicalReaction))
(defineType :AdditionReaction (:ChemicalReaction))
(defineType :NucleophilicAdditionReaction (:AdditionReaction))
(defineType :ElectrophilicAdditionReaction (:AdditionReaction))
(defineType :RadicalReaction (:AdditionReaction))
(defineType :FreeRadicalReaction (:ChemicalReaction))
(defineType :RearrangementReaction (:ChemicalReaction))
(defineType :12RearrangementReaction (:RearrangementReaction))
(defineType :PericyclicReaction (:RearrangementReaction))
(defineType :MetathesisReaction (:RearrangementReaction))
(defineType :PhotochemicalReaction (:ChemicalReaction))
(defineType :PolymerisationReaction (:ChemicalReaction))
(defineType :CondensationReaction (:ChemicalReaction))
(defineType :CondensationPolymerisationReaction (:CondensationReaction :PolymerisationReaction))
(defineType :RedoxReaction (:ChemicalReaction))
(defineType :HalfReaction (:ChemicalReaction))
(defineType :FunctionalGroupTransformation (:ChemicalReaction))

;;; reaction condition

(defineType :ReactionCondition (:Thing))

;;; mechanism

(defineType :Mechanism (:Thing))
(defineType :MechanismOfReactionType (:Mechanism))

;;; categorization

(defineType :Categorization (:Proposition))


;;; chemical equation

(defineType :ChemicalEquation (:Thing))

;;; comparatives

(defineType :Comparative (:Thing))
(defineType :GreaterComparative (:Comparative))
(defineType :SmallerComparative (:Comparative))

;;; ILOs

(defineType :ILO (:Act))

(defineType :Qualifier (:Thing))
(defineType :CriterionQualifier (:Qualifier))
(defineType :UsingQualifier (:Qualifier))
(defineType :PurposeQualifier (:Qualifier))

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
(defineType :Property (:DefinableThing))
(defineType :DerivedProperty (:Property))
(defineType :Quantity (:Property))
(defineType :UnitedQuantity (:Quantity))

(defineType :Value (:Number))
(defineType :UnitedValue (:Thing))

(defineType :EValue (:UnitedQuantity))

(defineType :Temperature (:UnitedQuantity :ReactionCondition))
(defineType :Pressure (:UnitedQuantity :ReactionCondition))

(defineType :MeanBondEnergy (:UnitedQuantity))
(defineType :CellPotential (:UnitedQuantity))
(defineType :StandardCellPotential (:CellPotential))

(defineType :Conc (:UnitedQuantity)) ; solution property?


(defineType :ActivationEnergy (:UnitedQuantity))

(defineType :ReactionRate (:UnitedQuantity))

(defineType :EquilibriumConstant (:Quantity))

(defineType :EquilibriumPosition (:Thing))

(defineType :Amount (:UnitedQuantity))

;;; equations

(defineType :MathematicalExpression (:Thing))
(defineType :Equation (:MathematicalExpression))
(defineType :RateEquation (:Equation))

(defineType :IntegratedRateEquation (:RateEquation))



;;; range qualifiers

(defineType :Low (:Quantity))
(defineType :High (:Quantity))
(defineType :VeryLow (:Quantity))
(defineType :VeryHigh (:Quantity))

;;; trend

(defineType :Trend (:Thing))

;;; action types

(defineType :ActionType (:Thing))

(defineType :Removal (:ActionType))

;;; state

(defineType :State (:Thing))
(defineType :PhysicalState (:State))
(defineType :ChangeOfState (:Thing))

;;; process

(defineType :Process (:DefinableThing))
(defineType :PhysicalProcess (:Process))
(defineType :ChemicalProcess (:Process))
(defineType :Creation (:Process))
(defineType :Separation (:Process))
(defineType :ChemicalSeparation (:Separation))
(defineType :PhysicalSeparation (:Separation))
(defineType :Characterisation (:Process))

(defineType :Titration (:Process))
(defineType :AcidBaseTitration (:Titration))




;;; system

(defineType :System (:DefinableThing))
(defineType :ChemicalSystem (:System))
(defineType :ChemicalReactionSystem (:System))

;;; role in process or event

(defineType :Role (:Thing))

;;; useOf

(defineType :Use (:Thing))
(defineType :UseAndCircumstance (:Thing))

;;; type of chemical reaction

(defineType :ReactionType (:Thing))

;;; manner 

(defineType :Manner (:Thing))

;;; means

(defineType :Means (:Thing))

;;; defining

(defineType :DefinableThing (:Thing))

;;; fundamental constants

(defineType :FundamentalConstant (:DefinableThing :Quantity))

;;; modifier

(defineType :Modifier (:Thing))

;;; subatomic particle

(defineType :SubatomicParticle (:DefinableThing))

;;; electrochem

(defineType :Electrode (:DefinableThing))
(defineType :ElectrodePotential (:DefinableThing))

(defineType :RedoxSystem (:ChemicalSystem))

(defineType :ElectricalCell (:ChemicalSystem))
(defineType :ElectrochemicalCell (:ElectricalCell))
(defineType :Battery (:Thing))
(defineType :FuelCell (:ElectricalCell))


;;; statistics

(defineType :ProbabilityDistribution (:DefinableThing))

;;; comparisons

(defineType :Difference (:Thing))
(defineType :Similarity (:Thing))

(defineType :Variation (:Thing))

;;; tests

(defineType :ChemicalTest (:Thing)) ; a type of process?
(defineType :ChemicalTestResult (:Thing))

;;; influence

(defineType :Influence (:Thing))
(defineType :ObjectiveInfluence (:Influence))

;;; information

(defineType :Information (:Thing))

;;; diagrams & graphs

(defineType :Diagram (:Thing))
(defineType :ReactionPathwayDiagram (:Diagram))

;;; artifacts

(defineType :Acid (:ChemicalSubstance))
(defineType :StrongAcid (:Acid))
(defineType :WeakAcid (:Acid))
(defineType :Base (:ChemicalSubstance))
(defineType :StrongBase (:Base))
(defineType :WeakBase (:Base))

(defineType :Indicator (:ChemicalSubstance))

(defineType :ChemicalSolution (:ChemicalSystem))
(defineType :BufferSolution (:ChemicalSolution))

(defineType :Reactant (:ChemicalSubstance))
(defineType :Product (:ChemicalSubstance))

;;; direction 

(defineType :Direction (:Thing))















