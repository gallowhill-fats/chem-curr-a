;;; ILO assert;;; Atoms, molecules and stereochemistry
 ;; 1. Define and use the terms relative atomic, isotopic and molecular masses, based on the carbon-13 scale. 
(assert '(Isa (DefineILO "relative atomic mass*") "ILO class*"))
(assert '(Isa (DefineILO "relative isotopic mass*") "ILO class*"))
(assert '(Isa (DefineILO "relative molecular mass*") "ILO class*"))
(assert '(ILOQualifier (DefineILO "relative atomic mass*")  (inTermsOf "carbon-13 scale*")))
(assert '(ILOQualifier (DefineILO "relative isotopic mass*") (inTermsOf "carbon-13 scale*")))
(assert '(ILOQualifier (DefineILO "relative molecular mass*") (inTermsOf "carbon-13 scale*")))
;; 2. Define and use the term mole in terms of the Avogadro constant.
(assert '(Isa (DefineILO "mole*") "ILO class*"))
(assert '(ILOQualifier (DefineILO "mole*")  (inTermsOf "Avogadro constant*")))
 ; 3. Analyse mass spectra in terms of isotopic abundances and molecular fragments.
(assert '(Isa (AnalyseILO (every x (Isa x "mass spectrum*"))) "ILO class*"))
(assert '(ILOQualifier (AnalyseILO (every x (Isa x "mass spectrum*"))) (inTermsOf "isotopic abundance*")))
(assert '(ILOQualifier (AnalyseILO (every x (Isa x "mass spectrum*"))) (inTermsOf "molecular fragments*")))
;??(assert '(Isa (AnalyseILO (every x (Isa x "mass spectrum class") (Isa x "simple things class") )) "ILO class*"))
;; 4. Calculate the relative atomic mass of an element given the relative abundances of its isotopes, or its mass spectrum.
 (assert '(Isa (CalculateILO (every x (hasQuantity "relative atomic mass*" y x) (Isa y "element class*") (Given (every z (hasIsotopicAbundance w y z))) ))  "ILO class*"))
 (assert '(Isa (CalculateILO (every x (hasQuantity "relative atomic mass*" y x) (Isa y "element class*") (Given (MassSpectrumOf y) )))  "ILO class*"))
 ;; 5. Write and/or construct balanced equations.
 (assert '(Isa (WriteILO (every x (Isa x "chemical equation class*") (isBalanced x))) "ILO class*") )
 ; 6. Perform calculations, including use of the mole concept, involving: (i) reacting masses (from formulae and equations) (ii) volumes of gases (e.g. in the burning of hydrocarbons) (iii) volumes and concentrations of solutions.
 (assert '(Isa (PerformILO (every x (Isa x "calculation class*") (Involves x ("volumes of gases*")))) "ILO class*"))
 (assert '(Isa (PerformILO (every x (Isa x "calculation class*") (Involves x ("reacting mass*")))) "ILO class*"))
 (assert '(Isa (PerformILO (every x (Isa x "calculation class*") (Involves x ("volumes and concentrations of solutions")))) "ILO class*"))
 ; 7. Deduce stoichiometric relationships from calculations such as those in the above.
 (assert '(Isa (DeduceILO  (every x (Isa x "stoichiometric relationship class*"))) "ILO class*"))
 ; 8. Identify and describe protons, neutrons and electrons in terms of their relative charges and relative masses. 
 (assert '(Isa (IdentifyILO (every x (Isa x "proton class*")) ) "ILO class*"))
 (assert '(ILOQualifier (IdentifyILO (every x (Isa x "proton class*"))) (inTermsOf (setof "relative mass*" "relative charge*" ))))
 (assert '(Isa (IdentifyILO (every x (Isa x "neutron class*")) ) "ILO class*"))
 (assert '(ILOQualifier (IdentifyILO (every x (Isa x "neutron class*"))) (inTermsOf (setof "relative mass*" "relative charge*"))))
 (assert '(Isa (IdentifyILO (every x (Isa x "electron class*")) ) "ILO class*"))
 (assert '(ILOQualifier  (IdentifyILO (every x (Isa x "electron class*"))) (inTermsOf (setof "relative  mass*" "relative charge*"))))
 (assert '(Isa (DescribeILO (every x (Isa x "proton class*")) ) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (every x (Isa x "proton class*"))) (inTermsOf (setof "relative mass*" "relative charge*"))))
 (assert '(Isa (DescribeILO (every x (Isa x "neutron class*")) ) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (every x (Isa x "neutron class*"))) (inTermsOf (setof "relative mass*" "relative charge*"))))
 (assert '(Isa (DescribeILO (every x (Isa x "electron class*")) ) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (every x (Isa x "electron class*"))) (inTermsOf (setof "relative  mass*" "relative charge*"))))
 ;; 9. Deduce the behaviour of beams of protons, neutrons and electrons in electric fields.
 (assert '(Isa (DeduceILO (BehaviorOf (BeamOf proton*) )) "ILO class*"))
 (assert '(ILOModifier (DeduceILO (BehaviorOf (BeamOf proton*))) (BehaviorOf (BeamOf proton*))  (inPresenceOf  "electric field*")))
 (assert '(Isa (DeduceILO (BehaviorOf (BeamOf neutron*) )) "ILO class*"))
 (assert '(ILOModifier (DeduceILO (BehaviorOf (BeamOf neutron*))) (BehaviorOf (BeamOf neutron*))  (inPresenceOf  "electric field*")))
 (assert '(Isa (DeduceILO (BehaviorOf (BeamOf electron*))) "ILO class*"))
 (assert '(ILOModifier (DeduceILO (BehaviorOf (BeamOf electron*))) (BehaviorOf (BeamOf electron*))  (inPresenceOf  "electric field*")))
 ;; 10. Describe the distribution of mass and charges within an atom.
 (assert '(Isa (DescribeILO (DistributionOfIn "mass*" "atom*")) "ILO class*"))
 (assert '(Isa (DescribeILO (DistributionOfIn "charge*" "atom*")) "ILO class*"))
 ;; 11. Deduce the numbers of protons, neutrons and electrons present in both atoms and ions given proton and nucleon numbers (and charge).
 (assert '(Isa (DeduceILO (CardinalityOf (setof proton* electron* neutron*))) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (CardinalityOf (setof proton* electron* neutron*))) (setof (inSystem (setof atom* ion*)) (Given (setof "proton number*" "neutron number*" charge*)))))
  ;; 12. Describe the contribution of protons and neutrons to atomic nuclei in terms of proton number and nucleon number (ii) distinguish between isotopes on the basis of different numbers of neutrons present (iii) recognise and use the symbolism A y x for isotopes, where x is a the nucleon number and y is the proton number.))
 ; need to isolate the case where the isotopes refer to the same element
 ; REWRITE: 12a. Define the terms proton number and nucleon number.
 (assert '(Isa (DefineILO "proton number*") "ILO class*"))
 (assert '(Isa (DefineILO "nucleon number*") "ILO class*"))
 (assert '(Isa (DistinguishBetweenILO (every x (IsotopeOf x (every y (Isa y "element class*"))))) "ILO class*"))
 (assert '(ILOQualifier (DistinguishBetweenILO (every x (IsotopeOf x y) (every y (Isa y "element class*" )))) (withCriterion "neutron number*")))
 ; 13. Describe the number and relative energies of the s, p and d orbitals for the principal quantum numbers 1, 2 and 3 and also the 4s and 4p orbitals.
 (assert '(Isa (DescribeILO (CardinalityOf (setof "s orbital*" "p orbital*" "d orbital*") )) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (CardinalityOf (setof "s orbital*" "p orbital*" "d orbital*") )) (inCase (hasValue "principal quantum number*" (setof 1 2 3)))))
 (assert '(Isa (DescribeILO (RelativeEnergyOf (setof "s orbital*" "p orbital*" "d orbital*") )) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (RelativeEnergyOf (setof "s orbital*" "p orbital*" "d orbital*") )) (inCase (hasValue "principal quantum number*" (setof 1 2 3)))))
 ;; 14. Describe the shapes of s and p orbitals and d orbitals.
 (assert '(Isa (DescribeILO (ShapeOf (setof "s orbital*" "p orbital*" "d-orbital*"))) "ILO class*"))
 ; 15. State the electronic configuration of atoms and ions given the proton number (and charge), using the convention 1s22s22p6 etc.
 (assert '(Isa (StateILO (every x (ElectronicConfigurationOf x) (Isa x "atom class*")) "ILO class*"))
 ;; 16. Explain and use the terms ionization energy and electron affinity (ii) explain the factors influencing the ionization energies of elements (iii) explain the trends in ionization energies across a Period and down a Group of the Periodic Table (see also Section 9).
 (assert '(Isa (DefineILO "ionization energy*") "ILO class*"))
 (assert '(Isa (DefineILO "electron affinity*") "ILO class*"))
 ;; 17. Deduce the electronic configurations of elements from successive ionisation energy data.
 (assert '(Isa (DeduceILO (every y (hasElectronicConfiguration x y) (Isa x "element class*"))) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (every x (hasElectronicConfiguration x y) (Isa x "element class*"))) (Using "successive ionization energy data*")))
 ; 18. Interpret successive ionisation energy data of an element in terms of the position of that element within the Periodic Table.
 (assert '(Isa (InterpretILO (TrendIn (every z (hasIonisationEnergy x y z)) (some x (Isa y "element class*")) (every z (Isa z "ordinality class*")) )) "ILO class*"))
 (assert '(ILOQualifier  (InterpretILO (TrendIn (every z (hasIonisationEnergy x y z)) (some x (Isa y "element class*")) (every z (Isa z "ordinal class*")))) (inTermsOf (some p (hasPositionInPeriodicTable y p)))))
 ;; 19. Describe ionic (electrovalent) bonding, as in sodium chloride and magnesium oxide, including the use of 'dot-and-cross' diagrams.
 (assert '(Isa (DescribeILO "ionic bonding*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "ionic bonding*") (setof (asIn (setof "sodium chloride*" "magnesium oxide*")) (Including (UseOf "dot-and-cross diagram*")))))
  ; 20. Describe, including the use of 'dot-and-cross' diagrams, (i) covalent bonding, as in hydrogen, oxygen, chlorine, hydrogen chloride, carbon dioxide, methane, ethene (ii) co-ordinate (dative covalent) bonding, as in the formation of the ammonium ion and in the Al 2Cl 6 molecule.
 (assert '(Isa (DescribeILO "covalent bonding*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "covalent bonding*")  Including (UseOf (every x (Isa x "dot-and-cross diagram*")))))
 (assert '(ILOQualifier (DescribeILO "covalent bonding*") (asIn (setof "hydrogen molecular entity*" "oxygen molecular entity*" "chlorine molecular entity*" "hydrogen chloride molecular entity*" "carbon dioxide molecular entity*" "methane molecular entity*" "ethene molecular entity*"))))
 (assert '(Isa (DescribeILO "coordinate bonding*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "coordinate bonding*")  (setof (Including (UseOf "dot-and-cross diagram*")) (asIn (setof "ammonium ion molecular cationic entity*" "aluminium chloride molecular entity*")))))
  ; 21. Explain the shapes of, and bond angles in, molecules by using the qualitative model of electron-pair repulsion (including lone pairs), using as simple examples: BF3 (trigonal), CO2 (linear), CH4 (tetrahedral), NH3 (pyramidal), H2O (non-linear), SF6 (octahedral), PF5 (trigonal bipyramid)).
 (assert '(Isa (ExplainILO (ShapeOf (every x (Isa x "molecular entity class*")))        "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (ShapeOf (every x (Isa x "molecular entity class*"))) (withExamples (setof "boron trifluoride molecular entity*" "carbon dioxide molecular entity*" "methane molecular entity*" "ammonia molecular entity*" "water molecular entity*" "sulfur hexafluoride molecular entity*" "phosphorus pentachloride molecular entity*")))))
 ; 22. Describe covalent bonding in terms of orbital overlap, giving σ and π bonds, including the concept of hybridisation to form sp, sp2 and sp3 orbitals
 (assert '(Isa (DescribeILO "covalent bonding*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "covalent bonding*") (inTermsOf "orbital overlap*")))
 ; 23. Explain the shape of, and bond angles in, the ethane, ethene and benzene molecules in terms of σ and π bonds (see also Section 10.1).
 (assert '(Isa (ExplainILO (ShapeOf (setof "ethane molecule" "ethene molecule" "benzene molecule" ) ) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (ShapeOf (setof "ethane molecule" "ethene molecule" "benzene molecule")) (Including "bond angles")))
 ; The above is not right wrt "bond angles"
 ; 24. Predict the shapes of, and bond angles in, molecules analogous to those specified in (c) and (e).
 (assert '(Isa (PredictILO (ShapeOf (every x (Isa x "molecular entity class*") (AnalogousTo x (setof "ethane molecular entity*" "ethene molecular entity*" "benzene molecular entity*")) "ILO class*"))
 ; 25. Describe hydrogen bonding, using ammonia and water as simple examples of molecules containing N-H and O-H groups.
 (assert '(Isa (DescribeILO "hydrogen bonding*") "ILO class*"))
 (assert '(ILOQualifier  (DescribeILO "hydrogen bonding*") (withExamples (setof "ammonia molecular entity*" "water molecular entity*"))))
 ;; 26. Understand, in simple terms, the concept of electronegativity and apply it to explain the properties of molecules such as bond polarity (3h), the dipole moments of molecules (3j), the behaviour of oxides with water (9.1j) and the acidities of chlorine-substituted ethanoic acids (10.6c).
 ; REWRITE: 26. Describe, in simple terms, the concept of electronegativity and use it to explain the properties of molecules such as bond polarity (3h), the dipole moments of molecules (3j), the behaviour of oxides with water (9.1j) and the acidities of chlorine-substituted ethanoic acids (10.6c).
 (assert '(Isa (DescribeILO "electronegativity*") "ILO class*"))
 (assert '(Isa (UseILO "electronegativity*") "ILO class*"))
 (assert '(Isa (ExplainILO "bond polarity*") "ILO class*"))
 (assert '(ILOQualifier (ExplainILO "bond polarity*") (Using "electronegativity*")))
 (assert '(Isa (ExplainILO (ExplainILO (QuantityOf "dipole moment*" (every x (Isa x "molecular entity class*")))) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (QuantityOf "dipole moment*" (every x (Isa x "molecular entity class*")))) (Using "elecronegativity*")))
 (assert '(ILOQualifier (ExplainILO (BehaviorOf (every x (Isa x "oxide substance class*")))) (Using "electronegativity*")))
 ; 27. Explain the terms bond energy, bond length and bond polarity and use them to compare the reactivities of covalent bonds (see also 5b(ii))
 (assert '(Isa (ExplainILO "bond energy*") "ILO class*"))
 (assert '(Isa (ExplainILO "bond length*") "ILO class*"))
 (assert '(Isa (ExplainILO "bond polarity*") "ILO class*"))
 (assert '(CompareILO (ReactivityOf (every x (Isa x  "covalent bond class*"))) (ReactivityOf (every y (Isa y  "covalent bond class*")))))
 (assert '(ILOQualifier (CompareILO (ReactivityOf (every x (Isa x  "covalent bond class*"))) (ReactivityOf (every y (Isa y  "covalent bond class*")))) (Using (setof "bond energy*" "bond length*" "bond polarity*"))))
 ; 28. Describe intermolecular forces (van der Waals’ forces), based on permanent and induced dipoles, as in CHCl 3(l); Br2(l) and the liquid noble gases
 (assert '(Isa (DescribeILO "van der Waals forces*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "van der Waals forces*") (BasedOn (setof "permanent dipole*" "induced dipole*"))))
 ; 29. Describe metallic bonding in terms of a lattice of positive ions surrounded by mobile electrons.
 (assert '(Isa (DescribeILO "metallic bonding*") "ILO class*"))
 ; 30. Describe, interpret and/or predict the effect of different types of bonding (ionic bonding, covalent bonding, hydrogen bonding, other intermolecular interactions, metallic bonding) on the physical properties of substances.
 (assert '(Isa (DescribeILO (EffectOfOn (setof "ionic bonding*" "covalent bonding*" "hydrogen bonding*" "metallic bonding*") (PhysicalPropertiesOf "chemical substance class*") )) "ILO class*"))
 ; 31. Deduce the type of bonding present from given information. ???
 ; omit
 (assert '(Isa (DeduceILO (BondingIn (every x (Isa x "chemical substance class*")))) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (BondingIn (every x (Isa x "chemical substance class*")))) (Given "physical data*")))
 ; 32. Show understanding of chemical reactions in terms of energy transfers associated with the breaking and making of chemical bonds.
 (assert '(Isa (DescribeILO (every x (Isa x "chemical reaction class*"))) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (every x (Isa x "chemical reaction class*"))) (inTermsOf (setof "bond formation*" "bond cleavage*"))))
 ;; 33. State the basic assumptions of the kinetic theory as applied to an ideal gas.
 (assert '(Isa (StateILO (UnderlyingAssumptionsOf "kinetic theory of gases*"))) "ILO class*"))
 (assert '(ILOModifier  (StateILO (UnderlyingAssumptionsOf "kinetic theory of gases*")) (UnderlyingAssumptionsOf "kinetic theory of gases*") (asAppliedTp "ideal gas*")))
 ;; 34. Explain qualitatively in terms of intermolecular forces and molecular size: (i) the conditions necessary for a gas to approach ideal behaviour (ii) 
 ;REWRITE
 ; 34a.  Explain qualitatively in terms of intermolecular forces and molecular size the conditions necessary for a gas to approach ideal behaviour. 
 ; 34b. Explain qualitatively in terms of intermolecular forces and molecular size the limitations of ideality at very high pressures and very low temperatures.
 (assert '(Isa (ExplainILO )(every y (hasNecessaryConditions "gas to approach ideal behaviour" y)) "ILO class*" ))
 (assert '(Isa (ExplainILO (every y (hasNecessaryConditions "gas to approach ideal behaviour" y))) "ILO class*" ))
 (assert '(ILOQualifier (ExplainILO (every y (hasNecessaryConditions "gas to approach ideal behaviour" y))) (setof (inTermsOf (setof (every x (Isa x "intermolecular force class*") "molecular size*")) (inManner "qualitative*")))))
 (assert '(ILOQualifier (ExplainILO (every y (hasNecessaryConditions "gas to approach ideal behaviour" y))) (setof (inTermsOf (setof (every x (Isa x "intermolecular force class") "molecular size*"))) (inManner "qualitative*"))))
 ;; 35. State and use the general gas equation pV = nRT in calculations, including the determination of Mr.
 (assert '(Isa (StateILO "ideal gas equation*") "ILO class*"))
 (assert '(Isa (PerformCalculationsWithILO "ideal gas equation*") "ILO class*"))
 (assert '(ILOQualifier (PerformCalculationsWithILO "ideal gas equation*") (Including (DeterminationOf "relative atomic mass*"))))
 ;; 36. Describe, using a kinetic-molecular model: the liquid state, melting, vaporisation, vapour pressure.
 (assert '(Isa (DescribeILO (setof "liquid state*" "melting*" "vaporisation*" "vapour pressure*"))  "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (setof "liquid state*" "melting*" "vaporisation*" "vapour pressure*")) (inTermsOf "kinetic-molecular model*")))
 ; 37. Describe, in simple terms, the lattice structure of a crystalline solid which is: (i) ionic, as in sodium chloride, magnesium oxide (ii) simple molecular, as in iodine (iii) giant molecular, as in silicon(IV) oxide and the graphite and diamond allotropes of carbon (iv) hydrogen-bonded, as in ice (v) metallic, as in copper, concept of the 'unit cell’ is not required?
 ;REWRITE
 ; 37a. Describe, in simple terms, the lattice structure of an ionic crystalline solid ionic, as in sodium chloride, magnesium oxide.
 ; 37b. Describe, in simple terms, the lattice structure of a simple molecular crystalline solid, as in iodine.
 ; 37c. Describe, in simple terms, the lattice structure of a giant molecular crystalline solid, as in silicon(IV) oxide and the graphite and diamond allotropes of carbon.
 ; 37d. Describe, in simple terms, the lattice structure of a hydrogen-bonded molecular crystalline solid, as in ice.
 ; 37e. Describe, in simple terms, the lattice structure of a metallic crystalline solid, as in copper.
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "ionic crystalline solid*") "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "simple molecular crystalline solid*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "giant molecular crystalline solid*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "hydrogen-bonded molecular crystalline solid*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "metallic crystalline solid*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" (every x (Isa x "solid chemical substance class*") (Isa x "crystalline substance class*") (Isa x "ionic substance class*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "simple molecular crystalline solid*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "giant molecular crystalline solid*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "hydrogen-bonded molecular crystalline solid*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedStructureOf "lattice" "metallic crystalline solid*")) "ILO class*"))
   ; 38. Explain the strength, high melting point and electrical insulating properties of ceramics in terms of their giant molecular structure.
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf "strength*" (every x (Isa x "ceramic class*")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf "high nelting point*" (every x (Isa x "ceramic class*")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf  "electrical insulator*" (every x (Isa x "ceramic class*")) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (NamedPhysicalPropertyOf "strength*" (every x (Isa x "ceramic class*")) "ILO class*") (inTermsOf "giant molecular structure*"))))
 (assert '(ILOQualifier (ExplainILO (NamedPhysicalPropertyOf "high nelting point*" (every x (Isa x "ceramic class*")) "ILO class*") (inTermsOf "giant molecular structure*"))))
 (assert '(ILOQualifier (ExplainILO (NamedPhysicalPropertyOf "electrical insulator*" (every x (Isa x "ceramic class*")) "ILO class*") (inTermsOf "giant molecular structure*"))))
 ; 39. Relate the uses of ceramics, based on magnesium oxide, aluminium oxide and silicon(IV) oxide, to their properties (suitable examples include furnace linings, electrical insulators, glass, crockery).
 (assert '(Isa (RelateToILO (UsesOf (every x (Isa x "ceramic class*"))) (PropertiesOfClass "ceramic class*"))) "ILO class*"))
 ; 40. Discuss the finite nature of materials as a resource and the importance of recycling processes. 
 (assert '(Isa (DiscussILO (NamedAspectOf "importance*" "recycling*")) "ILO class*"))
 ; 41. Outline the importance of hydrogen bonding to the physical properties of substances, including ice and water (for example, boiling and melting points, viscosity and surface tension)
 (assert '(Isa (OutlineILO (NamedAspectOf "importance*" "hydrogen bonding*")) "ILO class*"))
 (assert '(ILOQualifier (OutlineILO (NamedAspectOf "importance*" "hydrogen bonding*")  (inRelationTo (PhysicalPropertiesOfClass "chemical substance class*"))))
 ; 42. Suggest from quoted physical data the type of structure and bonding present in a substance.
 (assert '(Isa (SuggestILO (TypeOf (every x (hasStructure y x) (every y (Isa y "chemical substance class*" ) "ILO class*"))
 (assert '(ILOQualifier (SuggestILO (TypeOf (setof "structure*" "bonding*")) ) (Given "physical data*")))
 ; 43. Explain that some chemical reactions are accompanied by energy changes, principally in the form of heat energy; the energy changes can be exothermic (ΔH, negative) or endothermic
 (assert '(Isa (DefineILO "exothermic*") "ILO class*"))
 (assert '(Isa (DefineILO "endothermic*") "ILO class*"))
 (assert '(Isa (DefineILO "thermoneutral*") "ILO class*"))
 ; 44. Explain and use the terms: (i) enthalpy change of reaction and standard conditions, with particular reference to: formation, combustion, hydration, solution, neutralisation, atomisation (ii) bond energy (ΔH positive, i.e. bond breaking) (iii) lattice energy (ΔH negative, i.e. gaseous ions to solid lattice).
 (assert '(Isa (ExplainILO "enthalpy change of reaction*") "ILO class*"))
 ; 45. Calculate enthalpy changes from appropriate experimental results, including the use of the relationship enthalpy change, ΔH = –mcΔT.
 (assert '(Isa (CalculateILO (ChangeIn "enthalpy*"))  "ILO class*"))
 (assert '(ILOQualifier (CalculateILO (ChangeIn "enthalpy*")) (Given "experimental data*")))
 ; 46. Explain, in qualitative terms, the effect of ionic charge and of ionic radius on the numerical magnitude of a lattice energy.
 (assert '(Isa (ExplainILO (EffectOfOn "ionic charge*" (QuantityValue "lattice energy*")) "ILO class*"))
 (assert '(Isa (ExplainILO (EffectOfOn "ionic radius*" (QuantityValue "lattice energy*")) "ILO class*"))
 ; 47. Apply Hess' Law to construct simple energy cycles, and carry out calculations involving such cycles and relevant energy terms, with particular reference to: (i) determining enthalpy changes that cannot be found by direct experiment, e.g. an enthalpy change of formation from enthalpy changes of combustion (ii) average bond energies (iii) the formation of a simple ionic solid and of its aqueous solution (iv) Born-Haber cycles (including ionisation energy and electron affinity).
 (assert '(Isa (ApplyILO "Hess's law*") "ILO class*"))
 (assert '(ILOQualifier (ApplyILO "Hess's law*") (inOrderTo (PerformActionOn "construct*" "energy cycle*"))))
 ;; 48. Construct and interpret a reaction pathway diagram, in terms of the enthalpy change of the reaction and of the activation energy (see Section 8)
 (assert '(Isa (ConstructILO "reaction pathway diagram*") "ILO class*"))
 (assert '(Isa (InterpretILO "reaction pathway diagram*") "ILO class*"))
 (assert '(ILOQualifier (InterpretILO "reaction pathway diagram*") (inTermsOf (setof "enthalpy of reaction*" "activation energy*"))))
 ; 49. Calculate oxidation numbers of elements in compounds and ions (ii) describe and explain redox processes in terms of electron transfer and/or changes in oxidation number (oxidation state) (iii) use changes in oxidation numbers to help balance chemical equations.
 (assert '(Isa (CalculateILO (NamedQuantityOf "oxidation number*" (every x (Isa x "element class*") (isConstituentOf x (every y (or (Isa y "chemical substance class*") (Isa y "chemical substance class*")))) "ILO class*"))
 (assert '(Isa (DescribeILO "redox process class *") "ILO class*"))
 (assert '(Isa (ExplainILO  "redox process class*") "ILO class*"))
 ;; 50. Explain, including the electrode reactions, the industrial processes of: (i) the electrolysis of brine, using a diaphragm cell (ii) the extraction of aluminium from molten aluminium oxide/cryolite (iii) the electrolytic purification of copper.
 (assert '(Isa (ExplainILO (IndustrialProcess "electrolysis of brine industrial process*")) "ILO class*"))
 ;; 51. Define the terms: (i) standard electrode (redox) potential (ii) standard cell potential.
 (assert '(Isa (DefineILO "standard electrode potential*" "ILO class*"))
 (assert '(Isa (DefineILO "standard cell potential*" "ILO class*"))
 ;; 52. Describe the standard hydrogen electrode.
 (assert '(Isa (DescribeILO "standard hydrogen electrode*") "ILO class*"))
 ; 53. Describe methods used to measure the standard electrode potentials of: (i) metals or non-metals in contact with their ions in aqueous solution (ii) ions of the same element in different oxidation states.
 ; measure the standard electrode potential of metals in contact with their ions in aqueous solution
 ; measure the standard electrode potential of non-metals in contact with their ions in aqueous solution
 ; measure the standard electrode potential of ions of the same element in different oxidation states
 ; (StandardElectrodePotentialOf x)
 ; (every x (IsIonOf x y))
 ; (every x (Isa x metal))
 ; (every x (Isa x non-metal))
 ; (StandardElectrodePotentialOf (every x (Isa x "metal class") (InContactwith x (some y (IsIonOf y x) ) (InAqueousSolution x))
 ; (every x (hasStandardElectrodePotentialOf x (every y (Isa y "non-metal class")))
 (assert '(Isa (DescribeILO (every x (MethodFor x (Measure (NamedQuantityOf "standard electrode potential*" (every x (Isa x "metal class*") (inContactwith x (some y (isIonOf y x) ) (inAqueousSolution x)))))))) "ILO class*"))
 ; 54. Calculate a standard cell potential by combining two standard electrode potentials.
 (assert '(Isa (CalculateILO (every x (Isa x "standard cell potential class*")) "ILO class*"))
 (assert '(ILOQualifier  (CalculateILO (every x (Isa x "standard cell potential class*") ) (Using (EntitieswithCount "standard electrode potential*" 2))))
 ; 55. Use standard cell potentials to: (i) explain/deduce the direction of electron flow from a simple cell (ii) predict the feasibility of a reaction.
 (assert '(Isa (ExplainILO (DirectionOf "electron flow*")) "ILO class*"))
 (assert '(ILOQualifier  (ExplainILO (DirectionOf "electron flow*")) (inChemicalSystem "electrochemical cell*")))
 (assert '(ILOQualifier (ExplainILO (DirectionOf "electron flow*")) (Using "standard electrode potential*")))
 ; 56. Construct redox equations using the relevant half-equations.
 (assert '(Isa (ConstructILO (every x (Isa x "redox equation class*")) "ILO class*"))
 (assert '(Using (ConstructILO (every x (Isa x "redox equation class*")) (every y (HalfEquation y x) ))
 ;; 57. Predict qualitatively how the value of an electrode potential varies with the concentration of the aqueous ion.
 (assert '(Isa (PredictILO (EffectedChange (ValueOf "electrode potential*")) (ConcentrationOf "aqueous ion*")) "ILO class*"))
 (assert '(ILOQualifier (PredictILO (EffectedChange (ValueOf "electrode potential*")) (ConcentrationOf "aqueous ion*")) (inManner "qualitatively*")))
 ; 58. State the possible advantages of developing other types of cell, e.g. the H2/O2 fuel cell and improved batteries (as in electric vehicles) in terms of smaller size, lower mass and higher voltage.
 (assert '(Isa (DescribeILO (NamedAspectOf "design*" "battery*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (NamedAspectOf "design*" "battery*")) (inTermsOf (setOf (GreaterComparative size*) (SmallerComparative mass*) (GreaterComparative voltage*)))))
 (assert '(Isa (DescribeILO (NamedAspectOf "design*" "fuel cell*") "ILO class*"))
(assert '(ILOQualifier (DescribeILO (NamedAspectOf "design*" "fuel cell*")) (inTermsOf (setOf (GreaterComparative size*) (SmallerComparative mass*) (GreaterComparative voltage*)))))
 ; 59. State the relationship, F = Le, between the Faraday constant, the Avogadro constant and the charge on the electron.
 (assert '(Isa (StateILO (RelationBetween (setof "Faraday constant*" "Avogadro constant*" "electronic charge*"))) "ILO class*"))
 ; 60. Predict the identity of the substance liberated during electrolysis from the state of electrolyte (molten or aqueous), position in the redox series (electrode potential) and concentration.
 (assert '(Isa (PredictILO (ProductOfNamedProcess "electrolysis*")) "ILO class*"))
 (assert '(ILOQualifier (PredictILO (ProductOfNamedProcess "electrolysis*")) (Given (setof (IdentityOf "electrolyte*") (NamedPhysicalPropertyOf "state*" "electrolyte*")))))
 ; 61. Calculate: (i) the quantity of charge passed during electrolysis (ii) the mass and/or volume of substance liberated during electrolysis, including those in the electrolysis of H2SO4(aq), Na2SO4(aq).
 (assert '(Isa (AmountOf "charge passed during electrolysis*") "ILO class*"))
 (assert '(Isa (AmountOf "mass and/or volume of substance liberated during electrolysis*") "ILO class*"))
 ; 62. Describe the determination of a value of the Avogadro constant by an electrolytic method.
 (assert '(Isa (DescribeILO (DeterminationOf (ValueOf "Avogadro constant*"))) "ILO class*"))
 (assert '(Using (DeterminationOf (ValueOf "Avogadro constant*") "electrolysis*"))
 ; 63. Explain, in terms of rates of the forward and reverse reactions, what is meant by a reversible reaction and dynamic equilibrium.
 (assert '(Isa (ExplainILO "reversible reaction*") "ILO class*"))
 (assert '(ILOQualifier (ExplainILO "reversible reaction*") (inTermsOf (RateOf (setof "forward reaction*" "reverse reaction*")))))
 (assert '(Isa (ExplainILO "dynamic equilibrium*") "ILO class*"))
 (assert '(ILOQualifier (ExplainILO "dynamic equilibrium*") (inTermsOf (RateOf (setof "forward reaction*" "reverse reaction*")))))
 ;; 64. State Le Chatelier’s Principle and apply it to deduce qualitatively (from appropriate information) the effects of changes in temperature, concentration or pressure, on a system at equilibrium.
 ;;;REWRITe
 (assert '(Isa (StateILO "Le Chatelier’s Principle*") "ILO class*"))
 (assert '(Isa (DeduceILO (EffectOf (ChangeIn (setof "temperature*" "concentration*" "pressure*") "equilibrium system*"))) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (EffectOf (ChangeIn (setof "temperature*" "concentration*" "pressure*") "equilibrium system*"))) (Using "Le Chatelier’s Principle*")))                 
 ; 65. State whether changes in concentration, pressure or temperature or the presence of a catalyst affect the value of the equilibrium constant for a reaction.
 (assert '(Isa (StateILO (every x (hasEffectOn x (ValueOf "equilibrium constant*")))) "ILO class*"))
 ;; 66. Deduce expressions for equilibrium constants in terms of concentrations, Kc, and partial pressures, Kp of the relationship between Kp and Kc is not required?.
 (assert '(Isa (DeduceILO (MathematicalExpressionFor "concentration equilibrium constant*")) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (MathematicalExpressionFor "concentration equilibrium constant*")) (inTermsOf "equilibrium concentration*")))
 (assert '(Isa (DeduceILO (MathematicalExpressionFor "partial pressure equilibrium constant*")) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (MathematicalExpressionFor "partial pressure equilibrium constant*")) (inTermsOf "equilibrium partial pressure*")))
  ;; 67. Calculate the values of equilibrium constants in terms of concentrations or partial pressures from appropriate data.
 (assert '(Isa (CalculateILO (ValueOf "concentration equilibrium constant*")) "ILO class*"))
 (assert '(ILOQualifier (CalculateILO (ValueOf "concentration equilibrium constant*"))  (inTermsOf "concentration*")))
 (assert '(ILOQualifier (CalculateILO (ValueOf "partial pressure equilibrium constant*"))  (inTermsOf "partial pressure*"))
 ; 68. Calculate the quantities present at equilibrium, given appropriate data (such calculations will not require the solving of quadratic equations).
 (assert '(Isa (CalculateILO (NamedPhysicalPropertyof "concentration*") (every x (Isa x "chemical species class*") (isPartOf x "equilibrium system*"))) "ILO class*"))
 ; 69. Describe and explain the conditions used in the Haber process and the Contact process, as examples of the importance of an understanding of chemical equilibrium in the chemical industry (see also Section 9.6).
 (assert '(Isa (DescribeILO (ReactionConditionsOf "Haber process*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (ReactionConditionsOf "Haber process*")) (inRelationTo "position of equilibrium*")))
 (assert '(Isa (DescribeILO (ReactionConditionsOf "contact process*")) "ILO class*"))
 (assert '(ILOQualifier  (DescribeILO (ReactionConditionsOf "contact process*")) (inRelationTo "position of equilibrium*")))
 ;; 70. Show understanding of, and use, the Brønstedowry theory of acids and bases, including the use of the acid-I, base-II concept.
 ;;;REwRITE
 (assert '(Isa (DescribeILO "Brønsted-Lowry theory of acids and bases*") "ILO class*"))
 (assert '(inManner (DescribeILO "Brønsted-Lowry theory of acids and bases*") "brief*"))
 ; 71. Explain qualitatively the differences in behaviour between strong and weak acids and bases and the pH values of their aqueous solutions in terms of the extent of dissociation.
 (assert '(Isa (ExplainILO (DifferenceBetween (setof (ClassBehaviorOf "weak acid class*") (ClassBehaviorOf "strong acid class*")))) "ILO class*"))
 (assert '(Isa (ExplainILO (DifferenceBetween (setof (ClassBehaviorOf "weak base class*") (ClassBehaviorOf "strong base class*")))) "ILO class*"))
 ;; 72. Explain the terms pH, Ka, pKa, Kw and use them in calculations.
 (assert '(Isa (ExplainILO "pH*" )))
 (assert '(Isa (ExplainILO "acid dissociation constant*" )))
 (assert '(Isa (ExplainILO "pKa*" )))
 (assert '(Isa (ExplainILO "dissociation constant of water*" )))
 (assert '(Isa (PerformCalculationsILO "pH*" )))
 (assert '(Isa (PerformCalculationsILO "acid dissociation constant*")))
 (assert '(Isa (PerformCalculationsILO "pKa*"))
 (assert '(Isa (PerformCalculationsILO "dissociation constant of water*")))
 ; 73. Calculate [H+(aq)] and pH values for strong and weak acids and strong bases.
 (assert '(Isa (CalculateILO (NamedUnitaryQuantityOf "molarity*" "hydrogen ion species*"))) "ILO class*"))
 (assert '(Isa (CalculateILO (NamedUnitaryQuantityOf "molarity*" "hydrogen ion species*"))) "ILO class*"))
 (assert '(Isa (CalculateILO (NamedUnitaryQuantityOf "molarity*" "hydrogen ion species*"))) "ILO class*"))
 (assert '(Isa (CalculateILO (NamedUnitaryQuantityOf "molarity*" "hydrogen ion species*"))) "ILO class*"))
 (assert '(Isa (CalculateILO (NamedUnitaryQuantityOf "molarity*" "hydrogen ion species*"))) "ILO class*"))
 (assert '(Isa (CalculateILO (NamedUnitaryQuantityOf "molarity*" "hydrogen ion species*"))) "ILO class*"))
 (assert '(Isa (CalculateILO (NamedUnitaryQuantityOf "molarity*" "hydrogen ion species*"))) "ILO class*"))
 (assert '(Isa (CalculateILO (NamedUnitaryQuantityOf "molarity*" "hydrogen ion species*"))) "ILO class*"))
 ; 74. Explain the choice of suitable indicators for acid-base titrations, given appropriate data.
 (assert '(Isa (ChooseILO (QualifiedTerm "suitable*" "indicator*")) "ILO class*"))
 ; 75. Describe the changes in pH during acid-base titrations and explain these changes in terms of the strengths of the acids and bases.
 (assert '(Isa (DescribeILO (ChangeIn "pH*")) "ILO class*"))
 (assert '(During (DescribeILO (ChangeIn "pH*")) "acid-base titration*"))
 (assert '(Isa (ExplainILO (ChangeIn "pH*")) "ILO class*"))
 (assert '(ILOModifier  (ExplainILO (ChangeIn "pH*")) (ChangeIn "pH*") (During "acid-base titration*")))
 (assert '(ILOQualifier (ExplainILO (ChangeIn "pH*")) (inTermsOf (setof (NamedPhysicalPropertyOfClass "strength*" "acid class*") (NamedPhysicalPropertyOfClass "strength*" "base class*")))))
 ; 76. Explain how buffer solutions control pH (ii) describe and explain their uses, including the role of HCO3 – in controlling pH in blood.
 ;;;REWRITE
 ; 76a. Explain how buffer solutions control pH.
 ; 76b. Describe the uses of buffer solutions, including the role of HCO3 – in controlling pH in blood.
 ; 76b. Explain the uses of buffer solutions, including the role of HCO3 – in controlling pH in blood.
 (assert '(Isa (ExplainILO (UseOf "buffer solution*")) "ILO class*"))
 (assert '(Isa (ExplainHowILO (NamedActionOn "control*" "buffer solution*" "pH*" )) "ILO class*"))
 (assert '(Isa (DescribeILO (RoleOfIn "hydrogen carbonate ion species*" (NamedActionOn "control*" "buffer solution*" "pH*" ))) "ILO class*"))
 ;; 77. Calculate the pH of buffer solutions, given appropriate data.
 (assert '(Isa (CalculateILO (NamedClassinRelationToseOf "solubility product*")) "ILO class*"))
 ; 79. Calculate Ksp from concentrations and vice versa.
 (assert '(Isa (CalculateILO "solubility product*") "ILO class*"))
 (assert '(ILOQualifier  (CalculateILO "solubility product*") (Given (Data concentration*))))
 ;; 80. Show understanding of the common ion effect.
 ; REWRITE: 80a. State the common ion effect.
 ; 80b. Explain the common ion effect in terms of le Chatelier's principle.
 ; 80c. Describe the common ion effect in relation to the dissociation of weak acids and weak bases.
 ; 80d. Describe the common ion effect in relation to the solubility of a sparingly soluble salt.
 (assert '(Isa (StateILO "common ion effect*") "ILO class*"))
 (assert '(Isa (ExplainILO "common ion effect*") "ILO class*"))
 (assert '(ILOQualifier (ExplainILO "common ion effect*") (inTermsOf "le Chatelier's principle")))
 (assert '(Isa (DescribeILO "common ion effect*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "common ion effect*") (inRelationTo (NamedChemicalChangeOfClass "dissocation*" (setof "weak acid class*" "weak base class*")))))
 (assert '(ILOQualifier (DescribeILO "common ion effect*") (inRelationTo (NamedPhysicalPropertyOfClass "solubility*" "sparingly soluble salt class*"))))
 ;; 81. Explain and use the terms: rate of reaction, activation energy, catalysis, rate equation, order of reaction, rate constant, half-life of a reaction, rate-determining step.
 ; REWRITE: 81a. Define the terms rate of reaction, rate equation, order of reaction, rate constant.
 (assert '(Isa (DefineILO "rate of reaction*") "ILO class*")) 
 (assert '(Isa (DefineILO "rate equation*") "ILO class*")) 
 (assert '(Isa (DefineILO "order of reaction*") "ILO class*")) 
 (assert '(Isa (DefineILO "rate constant*") "ILO class*")) 
 ; 81b. Distinguish between the differential rate equation and the integrated rate equation of a chemical reaction.
 (assert '(Isa (DistinguishBetweenILO (setof "differential rate equation*" "integrated rate equation*")) "ILO class*"))
 ; 81c. Perform simple calculations involving rate equations.
 (assert '(Isa (PerformCalculationsILO "rate equation*") "ILO class*"))
  ; 81d. Define the term activation energy.
 (assert '(Isa (DefineILO "activation energy*") "ILO class*"))
 ; 81d. State the Arrhenius equation and use this to explain the effect of activation energy on reaction rate.
 (assert '(Isa (StateILO "Arrhenius equation*") "ILO class*"))
 (assert '(Isa (ExplainILO (EffectOfOn "activation energy*" "rate of reaction*")) "ILO class*"))
 (assert '(ILOQuantifier (ExplainILO (EffectOfOn "activation energy*" "rate of reaction*")) (Using "Arrhenius equation*")))
 ; Catalysis moved to 85.
 ; 82. Explain qualitatively, in terms of collisions, the effect of concentration changes on the rate of a reaction.
 (assert '(Isa (ExplainILO (EffectOfOn (ChangeIn "concentration*") "rate of reaction*")) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (EffectOfOn (ChangeIn "concentration*") "rate of reaction*")) (inManner "qualitative*")))
 ; 83. Show understanding, including reference to the Boltzmann distribution, of what is meant by the term activation energy.
 (assert '(Isa (DefineILO "activation energy*") "ILO class*"))
 (assert '(Isa (DescribeILO "activation energy*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "activation energy*") (inRelationTo "Boltzmann distribution*")))
 ; 84. Explain qualitatively, in terms both of the Boltzmann distribution and of collision frequency, the effect of temperature change on the rate of a reaction.
 (assert '(Isa (ExplainILO (EffectOfOn (ChangeIn "temperature*") "rate of reaction*" )) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (EffectOfOn (ChangeIn "temperature*") "rate of reaction*" )) (NamedPhysicalPropertyOfClass "strength*" "acid class*")(NamedPhysicalPropertyOfClass "strength*" "acid class*") (inTermsOf (setof "Boltzmann distribution*" "collision frequency*"))))
 ;; 85. Explain that, in the presence of a catalyst, a reaction has a different mechanism, i.e. one of lower activation energy.
 ; REWRITE: 85a. Define the term catalysis.
 (assert '(Isa (DefineILO "catalysis*") "ILO class*"))
 (assert '(Isa (DefineILO "catalyst*") "ILO class*"))
 (assert '(Isa (DescribeILO (MechanismOf "catalysis*")) "ILO class*"))
 ; 85b. Explain catalysis in terms of reaction mechanism and activation energy.
 (assert '(Isa (ExplainILO "catalysis*") "ILO class*"))
 (assert '(ILOQualifier (ExplainILO "catalysis*") (inTermsOf (setof "reaction mechanism" "activation energy"))))
 ; 86. Interpret catalysis in terms of the Boltzmann distribution.
 (assert '(Isa (InterpretILO "catalysis*") "ILO class*"))
 (assert '(ILOQualifier (InterpretILO "catalysis*") (inTermsOf "Boltzmann distribution*"))
 ; 87. Describe enzymes as biological catalysts (proteins) which may have specific activity.
 (assert '(Isa (DescribeILO "enzyme class*") "ILO class*"))
 (assert '(ILOQualifer (DescribeILO "enzyme class*")  (inTermsOf "catalysis*"))))
 ; 88. Construct and use rate equations of the form rate = kA?mB?n (limited to simple cases of single step reactions and of multistep processes with a rate-determining step, for which m and n are 0, 1 or 2), including: (i) deducing the order of a reaction from concentration-time graphs, by the initial rates method and half-life methods (ii) deducing, for zero- and first-order reactions, the order of reaction from concentration-time graphs (iii) verifying that a suggested reaction mechanism is consistent with the observed kinetics (iv) predicting the order that would result from a given reaction mechanism (and vice versa) (v) calculating an initial rate using concentration data forms of rate equations are not required?.
 (assert '(Isa (DeduceILO "reaction order*") "ILO class*"))
 (assert '(ILOQualifier (DeduceILO "total order of reaction*") (Using (GraphOf "concentration*" "time*")) (withMeans "half-life method*")))
 (assert '(ILOQualifier (DeduceILO "total order of reaction*") (Using (GraphOf "concentration*" "time*")) (withMeans "initial rates method*")))
 (assert '(ILOQualifier (DeduceILO "total order of reaction*") (Using (GraphOf "concentration*" "time*")) (fprSystem "zero-order reaction**")))
 (assert '(ILOQualifier (DeduceILO "total order of reaction*") (Using (GraphOf "concentration*" "time*")) (forSystem "first-order reaction**")))
 (assert '(Isa (VerifyILO (isConsistentWith (every x (Isa x "reaction mechanism*")) (NamedPropertyOfReaction "kinetics*" x))) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO "total order of reaction*") (Given "reaction mechanism*")))
 (assert '(Isa (DeduceILO "reaction mechanism*") "ILO class*"))
 (assert '(ILOQualifier (DeduceILO "reaction mechanism*") (Given "total order of reaction*")))
   ; 89. Show understanding that the half-life of a first-order reaction is independent of concentration (ii) use the half-life of a first-order reaction in calculations.
 (assert '(Isa (UnderstandILO (isIndependentOf (NamedQuantityOf "half-life*" "first-order reaction*") "concentration")) "ILO class*"))
 ; 90. Calculate a rate constant, for example by using the initial rates or half-life method.
  ; REWRITE: 90a. Calculate a rate constant using the initial rates method.
 ; 90b. Calculate a rate constant using the half-life method.
 (assert '(Isa (CalculateILO "rate constant*") "ILO class*"))
 (assert '(ILOQualifier (CalculateILO "rate constant*") (Using "half-life method*")))
 (assert '(ILOQualifier (CalculateILO "rate constant*") (Using "initial rates method*")))
 ; 91. Devise a suitable experimental technique for studying the rate of a reaction, from given information.
 (assert '(Isa (DeviseILO (QualifiedTerm (setof "suitable*" "experimental*") "technique*")) "ILO class*"))
 (assert '(ILOQualifier (DeviseILO (QualifiedTerm (setof "suitable*" "experimental*") "technique*")) (forPurpose (StudyOf "reaction rate*"))))
 ; 92. Outline the different modes of action of homogeneous and heterogeneous catalysis, including: (i) the Haber process (ii) the catalytic removal of oxides of nitrogen in the exhaust gases from car engines (see also Section 10.2) (iii) the catalytic role of atmospheric oxides of nitrogen in the oxidation of atmospheric sulfur dioxide (iv) catalytic role of Fe3+ in the I–/S2O82?– reaction.
 (assert '(Isa (DefineILO "homogeneous catalysis*")  "ILO class*"))
 (assert '(Isa (DefineILO "heterogeneous catalysis*")  "ILO class*"))
 (assert '(Isa (DescribeILO "homogeneous catalysis*")  "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "homogeneous catalysis*") (setof (asIn (TypedChemicalReactionOf "oxidation*" "sulfur dioxide substance*") (inSystem "atmosphere*")))))
 (assert '(Isa (DescribeILO "heterogeneous catalysis*")  "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "heterogeneous catalysis*") (asIn "Haber process*")))
 (assert '(ILOQualifier (DescribeILO "heterogeneous catalysis*") (asIn "catalytic conversion*")))
 (assert '(ILOQualifier (DescribeILO "heterogeneous catalysis*") (asIn (RoleOfIn "iron three plus ion species*" )))
 ; 93. Describe qualitatively (and indicate the periodicity in) the variations in atomic radius, ionic radius, melting point and electrical conductivity of the elements (see the Data Booklet).
 (assert '(Isa (DescribeILO (VariationIn (UnitaryQuantityOf "atomic radius*" (every x (Isa x "element class*")))) "ILO class*"))
 (assert '(Isa (DescribeILO (VariationIn (UnitaryQuantityOf "ionic radius*" (every x (Isa x "element class*")))) "ILO class*"))
 (assert '(Isa (DescribeILO (VariationIn (UnitaryQuantityOf "melting point*" (every x (Isa x "element class*")))) "ILO class*"))
 (assert '(Isa (DescribeILO (VariationIn (UnitaryQuantityOf "electrical conductivity*" (every x (Isa x "element class*")))) "ILO class*"))
 ; 94. Explain qualitatively the variation in atomic radius and ionic radius.
 (assert '(Isa (DescribeILO (VariationIn (UnitaryQuantityOf "ionic radius*" (every x (Isa x "element class*")))) "ILO class*"))
 (assert '(Isa (DescribeILO (VariationIn (UnitaryQuantityOf "atomic radius*" (every x (Isa x "element class*")))) "ILO class*"))
 ; 95. Interpret the variation in melting point and in electrical conductivity in terms of the presence of simple molecular, giant molecular or metallic bonding in the elements.
 (assert '(Isa (InterpretILO (VariationIn (UnitaryQuantityOf "melting point*" (every x (Isa x "element class*")))) "ILO class*"))
 (assert '(ILOQualifier (InterpretILO (VariationIn (UnitaryQuantityOf "melting point*" (every x (Isa x "element class*"))))  (inTermsOf )(setof "molecular bonding*" "giant molecular bonding*" "metallic bonding*"))))
 ; 96. Explain the variation in first ionisation energy.
 (assert '(Isa (ExplainILO (VariationIn "first ionization energy*") "ILO class*"))
 ; 97. Describe the reactions, if any, of the elements with oxygen (to give Na2O, MgO, Al 2O3, P4O10?, SO2, SO3), chlorine (to give NaCl? , MgCl? 2, Al 2Cl 6, SiCl? 4, PCl 5) and water (Na and Mg only).
 (assert '(Isa (DescribeILO (ChemicalReactionBySpecies (Reactant (setof "sodium element*" "oxygen element*")) (Product )) "ILO class*"))
 ; 98. State and explain the variation in oxidation number of the oxides and chlorides in terms of their valance shell electrons.
 (assert '(Isa (StateILO (VariationIn (NamedQuantityyOfClass "oxidation number*" "oxide substance class*"))) "ILO class*"))
 (assert '(inTermsOf (StateILO (VariationIn (NamedQuantityOfClass "oxidation number*" "oxide substance class*"))) "valence shell electrons*"))
 (assert '(Isa (StateILO (VariationIn (NamedQuantityOfClass "oxidation number*" "chloride substance class*"))) "ILO class*"))
 (assert '(ILOQualifier (StateILO (VariationIn (NamedQuantityOfClass "oxidation number*" "chloride substance class*"))) (inTermsOf "valence shell electrons*")))
 ; 99. Describe the reactions of the oxides with water of peroxides and superoxides is not required?.
 (assert '(Isa (DescribeILO (ReactionBetween (setof "oxide substance class*" "water substance*")))  "ILO class*"))
  ; 100. Describe and explain the acid/base behaviour of oxides and hydroxides including, where relevant, amphoteric behaviour in reaction with sodium hydroxide (only) and acids.
 (assert '(Isa (DescribeILO (NamedBehaviorOfClass "acid-base behavior*" "oxide substace class*")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedBehaviorOfClass "acid-base behavior*" "hydroxide substace class*")) "ILO class*"))
 ;; 101. Describe and explain the reactions of the chlorides with water.
 (assert '(Isa (DescribeILO (ReactionBetween (setof "metal chloride substance class*" "water substance*")))  "ILO class*"))
 (assert '(Isa (ExplainILO (ReactionBetween (setof "metal chloride substance class*" "water substance*"))) "ILO class*"))
 ; 102. Interpret the variations and trends in (f), (g), (h), and (i) in terms of bonding and electronegativity.
 (assert '(Isa (InterpretILO ) "ILO class*"))
 ; 103. Suggest the types of chemical bonding present in chlorides and oxides from observations of their chemical and physical properties.
 (assert '(Isa (SuggestILO (NamedPropertyOf "bonding*" (every x (Isa x "chloride substance class*") (Given (setof (ChemicalPropertiesOf x) (PhysicalPropertiesOf x)))))) "ILO class*"))
 ; 104. Predict the characteristic properties of an element in a given group by using knowledge of chemical periodicity.
 (assert '(Isa (PredictILO (every x (Isa x "element class*") (inGroup x (every y (Isa y "periodic table group class*")))))  "ILO class*"))
 (assert '(ILOQualifier (PredictILO (every x (Isa x "element class*") (inGroup x (every y (Isa y "periodic table group class*"))))) (Using "chemical periodicity*")))
 ; 105. Deduce the nature, possible position in the Periodic Table, and identity of unknown elements from given information about physical and chemical properties.
 (assert '(Isa (DeduceILO (IdentityOf (every x (Isa x "element class") (Given (ChemicalPropertiesOf x)) (Given (PhsyicalProeprtiesOf x)))) "ILO class*"))
 ; 106. describe the reactions of the elements with oxygen, water and dilute acids.
 (assert '(Isa (DescribeILO (ReactioBetween (setof (every x (Isa x "element class*")) "oxygen element*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (ReactioBetween (setof (every x (Isa x "element class*")) "water substance*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (ReactioBetween (setof (every x (Isa x "element class*")) (every y (Isa y "dilute acid class*"))))) "ILO class*"))
 ; 107. Describe the behaviour of the oxides, hydroxides and carbonates with water and with dilute acids.
 (assert '(Isa (DescribeILO (ReactionBetween  (setof "hydroxide substance class*" "water substance*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionBetween  (setof "carbonate substance class*" "water substance*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionBetween  (setof "oxide substance class*" "water substance*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionBetween  (setof "hydroxide substance class*" (every y (Isa y "dilute acid class*"))))) "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionBetween  (setof "carbonate substance class*" (every y (Isa y "dilute acid class*"))))) "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionBetween  (setof "oxide substance class*" (every y (Isa y "dilute acid class*"))))) "ILO class*"))
  ; 108. Describe the thermal decomposition of the nitrates and carbonates.
 (assert '(Isa (DescribeILO (TypeOfReactionOfClass "thermal decomposition*" "nitrate substance class*")) "ILO class*"))
 (assert '(Isa (DescribeILO (TypeOfReactionOfClass "thermal decomposition*" "carbonate substance class*")) "ILO class*"))
 ; 109. Interpret, and make predictions from, the trends in physical and chemical properties of the elements and their compounds.
 (assert (Isa (InterpretILO (every x (isTrendIn x (setof (PhysicalPropertiesOf (every y (Isa y "element class*"))) (ChemicalPropertiesOf (every y (Isa y "element class*"))))))) "ILO class*"))
 (assert (Isa (InterpretILO (every x (isTrendIn x (setof (PhysicalPropertiesOf (every y (isCompoundOf y z))) (ChemicalPropertiesOf (every y (isCompoundOf y z))))))) "ILO class*"))
 ; 110. Explain the use of magnesium oxide as a refractory lining material.
 (assert '(Isa (ExplainILO (UseOfAs "magnesium oxide substance*" "refractory lining material*")) "ILO class*"))
  ; 111. Describe and explain the use of lime in agriculture.
 (assert '(Isa (DescribeILO (UseOfIn "lime*" "agriculture*")) "ILO class*"))
 (assert '(Isa (ExplainILO (UseOfIn "lime*" "agriculture*")) "ILO class*"))
 ; 112. Interpret and explain qualitatively the trend in the thermal stability of the nitrates and carbonates in terms of the charge density of the cation and the polarisability of the large anion.
 (assert '(Isa (ExplainILO (TrendIn (NamedPhysicalPropertyOfClass "thermal stability*" "nitrate substance class*"))) "ILO class*"))
(assert '(ILOQualifier (ExplainILO (TrendIn (NamedPhysicalPropertyOfClass "thermal stability*" "nitrate substance class*"))) (inTermsOf (setof (NamedPhysicalPropertyOf "charge density*" "cation*") (NamedPhysicalPropertyOf "polarisability*" "anion*")))))
 (assert '(Isa (ExplainILO (TrendIn (NamedPhysicalPropertyOfClass "thermal stability*" "carbonate substance class*"))) "ILO class*"))
 ; 113. Interpret and explain qualitatively the variation in solubility of the sulfates in terms of relative magnitudes of the enthalpy change of hydration and the corresponding lattice energy.
 (assert '(Isa (ExplainILO (VariationIn (NamedPhysicalPropertyOfClass "solubility*" "sulfate substance class*"))) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (VariationIn (NamedPhysicalPropertyOfClass "solubility*" "sulfate substance class*"))) (inTermsOf (setof (MagnitudeOf "enthalpy of hydration*") (MagnitudeOf "lattice energy*")))))
 ; 114. Outline the variation in melting point and in electrical conductivity of the elements and interpret them in terms of structure and bonding.
 ; 115. Describe and explain the bonding in, molecular shape and volatility of the tetrachlorides.
 (assert '(Isa (DescribeILO (VariationIn (NamedPhysicalPropertyOfClass "melting point*" "element class*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (VariationIn (NamedPhysicalPropertyOfClass "electrical conductivity*" "element class*"))) "ILO class*"))
 (assert '(Isa (InterpretILO (VariationIn (NamedPhysicalPropertyOfClass "melting point*" "element class*"))) "ILO class*"))
 (assert '(Isa (InterpretILO (VariationIn (NamedPhysicalPropertyOfClass "electrical conductivity*" "element class*"))) "ILO class*"))
 (assert '(ILOQualifier (InterpretILO (VariationIn (NamedPhysicalPropertyOfClass "melting point*" "element class*"))) (inTermsOf (setof "structure*" "bonding*"))))
 (assert '(ILOQualifier (InterpretILO (VariationIn (NamedPhysicalPropertyOfClass "electrical conductivity*" "element class*"))) (inTermsOf (setof "structure*" "bonding*"))))
 (assert '(Isa (DescribeILO (ShapeOf (every x (Isa x "tetrachloride molecular class*")))) "ILO class*"))
 (assert '(Isa (DescribeILO (BondingIn (every x (Isa x "tetrachloride molecular class*")))) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedPhysicalPropertyOfClass "volatility*" "tetrachloride substance class*")) "ILO class*"))
  ; 116. Describe and explain the reactions of the tetrachlorides with water in terms of structure and bonding.
 (assert '(Isa (DescribeILO (ReactionBetween (setof "tetrachloride substance class*" "water substance*"))) "ILO class*"))
 (assert '(Isa (ExplainILO (ReactionBetween (setof "tetrachloride substance class*" "water substance*"))) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (ReactionBetween (setof "tetrachloride substance class*" "water substance*"))) (inTermsOf (setof "structure*" "bonding*")))))
 (assert '(ILOQualifier (ExplainILO (ReactionBetween (setof "tetrachloride substance class*" "water substance*"))) (inTermsOf (setof "structure*" "bonding*")))))
 ; 117. Describe and explain the bonding, acid-base nature and thermal stability of the oxides of oxidation states II and IV.
 (assert '(Isa (DescribeILO (NamedPhysicalPropertyOf "bonding*" (every x (Isa x "oxide class*") (hasOxidationState x "II")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedPhysicalPropertyOf "bonding*" (every x (Isa x "oxide class*") (hasOxidationState x "IV")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedPhysicalPropertyOf "acid-base nature*" (every x (Isa x "oxide class*") (hasOxidationState x "II")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedPhysicalPropertyOf "acid-base nature*" (every x (Isa x "oxide class*") (hasOxidationState x "IV")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedPhysicalPropertyOf "thermal stability*" (every x (Isa x "oxide class*") (hasOxidationState x "II")) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedPhysicalPropertyOf "thermal stability*" (every x (Isa x "oxide class*") (hasOxidationState x "IV")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf "bonding*" (every x (Isa x "oxide class*") (hasOxidationState x "II")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf "bonding*" (every x (Isa x "oxide class*") (hasOxidationState x "IV")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf "acid-base nature*" (every x (Isa x "oxide class*") (hasNamedQuantityValue "oxidation state*" x "II")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf "acid-base nature*" (every x (Isa x "oxide class*") (hasNamedQuantityValue "oxidation state*" x "IV")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf "thermal stability*" (every x (Isa x "oxide class*") (hasNamedQuantityValue "oxidation state*" x "II")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOf "thermal stability*" (every x (Isa x "oxide class*") (hasNamedQuantityValue "oxidation state*" x "IV")) "ILO class*"))
 ; 118. Describe and explain the relative stability of higher and lower oxidation states of the elements in their oxides and aqueous cations including, where relevant, E values.
 (assert '(Isa (DescribeILO (RelativeStabilityOfClass (every x (Isa x "element oxide substance class*") (hasNamedQuantityNamedRange "oxidation state*" x "lower*")) "ILO class*"))
 (assert '(Isa (DescribeILO (RelativeStabilityOfClass (every x (Isa x "element oxide substance class*") (hasNamedQuantityNamedRange "oxidation state*" x "higher*")) "ILO class*"))
 ;; 119. Describe the colours of, and the trend in volatility of chlorine, bromine and iodine.
  (assert '(Isa (DescribeILO (TrendInSet (setof (NamedPhysicalPropertyOf "volatility*" "chlorine element*") (NamedPhysicalPropertyOf "volatility*" "bromine element*") (NamedPhysicalPropertyOf "volatility*" "iodine element*"))) ) "ILO class*"))
 ;; 120. Interpret the volatility of the elements in terms of van der Waals’ forces.
 (assert '(Isa (InterpretILO (NamedPhysicalPropertyOfClass "volatility" "element class*")) "ILO class*"))
 (assert '(ILOQualifier (InterpretILO (NamedPhysicalPropertyOfClass "volatility*" "element class*")) (inTermsOf "van der Waals forces*")))
 ; 121. Describe and deduce from E values the relative reactivity of the elements as oxidising agents.
 (assert '(Isa (DeduceILO (RelativeReactivityOf (every x (Isa x "element class*") (Isa x "oxidising agent class*"))))) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (RelativeReactivityOf (every x (Isa x "element class*") (Isa x "oxidising agent class*"))))) (Grounds "E value*"))
 ;; 122. Describe and explain the reactions of the elements with hydrogen.
 (assert '(Isa (DescribeILO (ReactionsBetween (setof (every x (Isa x "element class*") "hydrogen element*" ))))) "ILO class*"))
 (assert '(Isa (ExplainILO (ReactionsBetween (setof (every x (Isa x "element class*") "hydrogen element*" ))))) "ILO class*"))
 ; 123. Describe and explain the relative thermal stabilities of the hydrides (ii) interpret these relative stabilities in terms of bond energies.
 (assert '(Isa (DescribeILO (RelativeNamedPhysicalpropertyOfClass  "thermal stability*" "hydride substance class*")) "ILO class*"))
 (assert '(Isa (ExplainILO (RelativeNamedPhysicalpropertyOfClass  "thermal stability*" "hydride substance class*")) "ILO class*"))
 (assert '(Isa (InterpretILO (RelativeNamedPhysicalpropertyOfClass  "thermal stability*" "hydride substance class*")) "ILO class*"))
 (assert '(ILOQualifier (InterpretILO (RelativeNamedPhysicalpropertyOfClass  "thermal stability*" "hydride substance class*")) (inTermsOf "bond energy*")))
 ; 124. Describe and explain the reactions of halide ions with (i) aqueous silver ions followed by aqueous ammonia (ii) concentrated sulfuric acid.
 (assert '(Isa (DescribeILO (ReactionBetween "halide ion species class*" (QualifiedSubstance  "silver ion species class*" (setof (State "aqueous*") (Temperature "hot*"))))) "ILO class*")) ;;; followed by?
 (assert '(Isa (DescribeILO (ReactionBetween "halide ion species class*" "concentrated sulfuric acid*")) "ILO class*"))
 ; 125. Outline a method for the manufacture of chlorine from brine by a diaphragm cell (see also Section 6).
 (assert '(Isa (OutlineILO (some x () (isMethodFor x (ManufactureOfFrom "chlorine element*" "brine*")) (Involves x "diaphragm cell*"))) "ILO class*"))
 ; 126. Describe and interpret in terms of changes of oxidation number the reaction of chlorine with cold, and with hot, aqueous sodium hydroxide.
 (assert '(Isa (DescribeILO (ReactionBetween (setof "chlorine element*" (QualifiedSubstance "sodium hydroxide substance*" (setof (State "aqueous*") (Temperature "hot*")))))) "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionBetween (setof "chlorine element*" (QualifiedSubstance "sodium hydroxide substance*" (setof (State "aqueous*") (Temperature "cold*")))))) "ILO class*"))
 ;; 127. Explain the use of chlorine in water purification.
 (assert '(Isa (ExplainILO (UseOfFor "hydrogen molecular substance*" (PurificationOf "water substance*")) ) "ILO class*"))
  ; 128. State the industrial importance and environmental significance of the halogens and their compounds (e.g. for bleaches, PVC, halogenated hydrocarbons as solvents, refrigerants and in aerosols) (see also Section 10.3)
 (assert '(Isa (State (NamedAspectOfClass "industrial importance*" "halogen substance class*"))) "ILO class*"))
 ; 129. Explain what is meant by a transition element, in terms of d-block elements forming one or more stable ions with incomplete d orbitals.
 (assert '(Isa (ExplainTermILO "transition element*") "ILO class*"))
 (assert '(ILOQualifier (ExplainTermILO "transition element*") (inTermsOf (FormationOfClass "complex ion class*"))))
 ;; 130. State the electronic configuration of a first row transition element and of its ions.
 (assert '(Isa (StateILO (ElectronicConfigurationOf (every x (Isa x "first row transition element class*"))) "ILO class*")))
 ; 131. Contrast, qualitatively, the melting points and densities of the transition elements with those of calcium as a typical s-block element.
 (assert '(Isa (ContrastILO (NamedPhysicalPropertyOfClass "melting point*" "transition element class*") (NamedPhysicalPropertyOf "melting point*" "calcium element*")) "ILO class*"))
 (assert '(Isa (ContrastILO (NamedPhysicalPropertyOfClass "density*" "transition element class*") (NamedPhysicalPropertyOf "density*" "calcium element*")) "ILO class*"))
 ; 132. Describe the tendency of transition elements to have variable oxidation states
 (assert '(Isa (DescribeILO (Tendency (every x (Isa x "transition element class*")) (hasProperty "variable oxidation state*" x)) "ILO class*"))
 ; 133. Predict from a given electronic configuration, the likely oxidation states of a transition element.
 (assert '(Isa (PredictILO (NamedQuantityOf "oxidation state*" (every x (Isa x "transition element class*") )) "ILO class*"))
 (assert '(ILOQuantifier (PredictILO (NamedQuantityOf "oxidation state*" (every x (Isa x "transition element class*") )) (Given (ElectronicConfiguratonOf x)))))
 ; 134. Describe and explain the use of Fe3+/Fe2+, MnO4?−/Mn2+ and Cr2O72?−/Cr3+ as examples of redox systems (see also Section 6).
 (assert '(Isa (DescribeILO (UseOf (RedoxSystem ))) "ILO class*"))
 ; 135. Predict, using E values, the likelihood of redox reactions.
 (assert '(Isa (PredictILO (LikelihoodOf (every x (Isa x "redox reaction class*") ))) ILO ))
 (assert '(ILOQualifier  (PredictILO (LikelihoodOf (every x (Isa x "redox reaction class*") ))) (Given (every y (Isa y "E value class*")))))
 ; 136. Explain the reactions of transition elements with ligands to form complexes, including the complexes of copper(II) ions with water, hydroxide, ammonia and chloride ions.
 (assert '(Isa (DescribeILO (TypedChemicalReactionsOfClass "formation*" "complex ion class*" )) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (TypedChemicalReactionsOfClass "formation*" "complex ion class*" )) (Including (setof (ComplexIon "copper element*" "2" "water molecule*") (ComplexIon "copper element*" "2" "ammonia molecular entity*") (ComplexIon "copper element*" "2" "chloride anionic entity*")))))
 ; 137. Define the term ligand as a species that contains a lone pair of electrons that forms a dative bond to a central metal atom/ion.
 (assert '(Isa (DefineILO "ligand*") "ILO class*"))
 ; 138. Define the term complex as a molecule or ion formed by a central metal atom/ion surrounded by one or more ligands.
 (assert '(Isa (DefineILO "complex*") "ILO class*"))
 ; 139. Describe transition metal complexes as linear, octahedral, tetrahedral or square planar.
 (assert '(Isa (IdentifyILO (ShapeOf (every x (Isa x "transition metal complex class*"))))  "ILO class*"))
 (assert '(ILOQualifier (IdentifyILO (ShapeOf (every x (Isa x "transition metal complex class*")) )) (fromOptions (setof "linear*" "octahedral*" "tetrahedral*" "square planar*"))))
 ; 140. Explain qualitatively that ligand exchange may occur, including the complexes of copper(II) ions with water, hydroxide, ammonia and chloride ions.
 (assert '(Isa (DescribeILO "ligand exchange*") "ILO class*") 
 (assert '(ILOQualifier (DescribeILO "ligand exchange*") (withReferenceTo (setof (InteractionBetween "copper II complex class*" "water substance*") (InteractionBetween "copper II complex class*" "ammonia substance*") (InteractionBetween "copper II complex class*" "chloride ion species*")) ))) 
 ; 141. Describe the shape and symmetry of the d orbitals, and the splitting of degenerate d orbitals into two energy levels in octahedral complexes using the complexes of copper(II) ions with water and ammonia as examples.
 (assert '(Isa (DescribeILO (NamedPropertyOfClass "shape*" "d-orbital class*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (NamedPropertyOfClass "symmetry*" "d-orbital class*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (RemovelOfFrom "degeneracy*" "d-orbital class*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (RemovelOfFrom "degeneracy*" "d-orbital class*")) (setof (withReferenceTo "octahedral complex class*") (withExamples "copper II water complex class*"))))
 (assert '(ILOQualifier (DescribeILO (RemovelOfFrom "degeneracy*" "d-orbital class*"))  (setof (withReferenceTo "octahedral complex class*") (withExamples "copper II ammonia complex class*"))))
  ; 142. Explain the origin of colour in transition element complexes resulting from the absorption of light energy as an electron moves between two non-degenerate d orbitals.
 (assert '(Isa (ExplainILO (OriginOf "color*")) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (OriginOf "color*")) (inDomain "transition element complex ion class*")))
 ; 143. Describe, in qualitative terms, the effects of different ligands on absorption, and hence colour, using the complexes of copper(II) ions with water, hydroxide, ammonia and chloride ions as examples.
 (assert '(Isa (DescribeILO (EffectOfOn (every x (Isa x "ligand class*")) "color**") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (EffectOfOn (every x (Isa x "ligand class*")) "color**") (withExamples (setof (ComplexIon "copper element*" "2" "water molecule*") (ComplexIon "copper element*" "2" "ammonia molecular entity*") (ComplexIon "copper element*" "2" "chloride anionic entity*"))))))
 ; 144. Apply the above ideas of ligands and complexes to other metals, given information
 ;; ??
 ; 145. Explain the lack of reactivity of nitrogen
 (assert '(Isa (ExplainILO (NamedChemicalPropertyOf "unreactivity*"  "nitrogen element*")) "ILO class*"))
 ; 146. Describe and explain: (i) the basicity of ammonia (see Section 7) (ii) the structure of the ammonium ion and its formation by an acid-base reaction (iii) the displacement of ammonia from its salts.
 (assert '(Isa (DescribeILO (NamedPropertyOf "basicity*" "ammonia substance class*")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPropertyOf "basicity*" "ammonia substance class*")) "ILO class*"))
 ; 147. Describe the Haber process for the manufacture of ammonia from its elements, giving essential operating conditions, and interpret these conditions (qualitatively) in terms of the principles of kinetics and equilibria (see also Sections 7 and 8).
 (assert '(Isa (DescribeILO "Haber process*") "ILO class*"))
 ; 148. State the industrial importance of ammonia and nitrogen compounds derived from ammonia.
 (assert '(Isa (NamedAspectOf "industrial importance*" (setof CompoundsOf(setof "ammonia element*"  "nitrogen element*"))) "ILO class*"))
 ; 149. State and explain the environmental consequences of the uncontrolled use of nitrate fertilisers.
 (assert '(Isa (StateILO (QualifiedTerm "environmental*" (ConsequencesOf (NamedUseOfClass "fertiliser**" "nitrate substance class*"))))) "ILO class*"))
 (assert '(Isa (ExplainILO (QualifiedTerm "environmental*" (ConsequencesOf (NamedUseOfClass "fertiliser*" "nitrate substance class*"))))) "ILO class*"))
  ; 150. State and explain the natural and man-made occurrences of oxides of nitrogen and their catalytic removal from the exhaust gases of internal combustion engines.
 (assert '(Isa (ExplainILO (NamedAspectOfClass "natural occurrence*" "oxide of nirogen class*")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedAspectOfClass "man-made  occurrence*" "oxide of nitrogen class*")) "ILO class*"))
 ; 151. Explain why atmospheric oxides of nitrogen are pollutants, including their catalytic role in the oxidation of atmospheric sulfur dioxide.
 (assert '(Isa (ExplainWhyILO (every x (Isa x (oxide of nitrogen class*)) (Isa x "atmospheric pollutant class*"))) "ILO class*"))
 ; 152. Describe the formation of atmospheric sulfur dioxide from the combustion of sulfur contaminated carbonaceous fuels.
 (assert '(Isa (DescribeILO (NamedAspectOf "origin*" "sulfur dioxide substance*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (NamedAspectOf "origin*" "sulfur dioxide substance*")) (inDomain "atmosphere*")))
 ; 153. State the role of sulfur dioxide in the formation of acid rain and describe the main environmental consequences of acid rain. .
 (assert '(Isa (StateILO (RoleOfIn "sulfur dioxide substance*" (FormationOf "acid rain*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (every x (isConsequenceOf x "acid rain*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (every x (isConsequenceOf x "acid rain*")) (inDomain "environment*"))))
 ; 154. State the main details of the Contact process for sulfuric acid production.
 (assert '(Isa (DescribeILO "contact process*") "ILO class*"))
 ; 155. Describe the use of sulfur dioxide in food preservation
 (assert '(Isa (DescribeILO (UseOfFor "sulfur dioxide molecular substance*" "food preservation*")) "ILO class*"))
  ; 156. Interpret, and use the general, structural, displayed and skeletal formulae of the following classes of compound: (i) alkanes, alkenes and arenes (ii) halogenoalkanes and halogenoarenes (iii) alcohols (including primary, secondary and tertiary) and phenols (iv) aldehydes and ketones (v) carboxylic acids, esters and acyl chlorides (vi) amines (primary only), nitriles, amides and amino acids will be expected to recognise the shape of the benzene ring when it is present in organic compounds. Knowledge of benzene or its compounds is not required for AS.?
 (assert '(Isa (InterpretILO (every y (Isa y "structural formula class*") (hasStructuralFormula x y) (Isa x "alkane molecular substance class*")))) "ILO class*"))
 (assert '(Isa (UseILO (every y (Isa y "structural formula class*") (hasStructuralFormula x y) (Isa x "alkane molecular substance class*")))) "ILO class*"))
 (assert '(Isa (InterpretILO (every y (Isa y "structural formula class*") (hasStructuralFormula x y) (Isa x "alkene molecular substance class*")))) "ILO class*"))
 (assert '(Isa (UseILO (every y (Isa y "structural formula class*") (hasStructuralFormula x y) (Isa x "alkene molecular substance class*")))) "ILO class*"))
 ; 157. Interpret, and use the following terminology associated with organic reactions: (i) functional group (ii) homolytic and heterolytic fission (iii) free radical, initiation, propagation, termination (iv) nucleophile, electrophile (v) addition, substitution, elimination, hydrolysis (vi) oxidation and reduction equations for organic redox reactions, the symbols [O? and H? are acceptable].
 (assert '(Isa (DefineILO "functional group*") "ILO class*"))
 (assert '(Isa (DefineILO "homolytic fission*") "ILO class*"))
 (assert '(Isa (DefineILO "heterolytic fission*") "ILO class*"))
 (assert '(Isa (DefineILO "free radical*") "ILO class*"))
 (assert '(Isa (DefineILO "initiation reaction*") "ILO class*"))
 (assert '(Isa (DefineILO "propagation reaction*") "ILO class*"))
 (assert '(Isa (DefineILO "termination reaction*") "ILO class*"))
 (assert '(Isa (DefineILO "nucleophile*") "ILO class*"))
 (assert '(Isa (DefineILO "electrophile*") "ILO class*"))
 (assert '(Isa (DefineILO "addition reaction*") "ILO class*"))
 (assert '(Isa (DefineILO "substitution reaction*") "ILO class*"))
 (assert '(Isa (DefineILO "elimination reaction*") "ILO class*"))
 (assert '(Isa (DefineILO "hydrolysis reaction*") "ILO class*"))
 (assert '(Isa (DefineILO "redox reaction*") "ILO class*"))
 ; 158. Describe the shapes of the ethane, ethene and benzene molecules.
 (assert '(Isa (DescribeILO (ShapeOf "ethane molecular entity*")) "ILO class*")
 (assert '(Isa (DescribeILO (ShapeOf "ethene molecular entity*")) "ILO class*"))
 (assert '(Isa (DescribeILO (ShapeOf "benzene molecular entity*")) "ILO class*"))
 ; 159. Predict the shapes of other related molecules.
 (assert '(Isa (PredictILO (ShapeOf (every x (Isa x "alkane molecular entity class*")))) "ILO class*"))
 (assert '(Isa (PredictILO (ShapeOf (every x (Isa x "alkene molecular entity class*")))) "ILO class*"))
 (assert '(Isa (PredictILO (ShapeOf (every x (Isa x "aromatic molecular entity class*")))) "ILO class*"))
 ;; 160. Explain the shapes of the ethane, ethene and benzene molecules in terms of σ and π carbon-carbon bonds.
 (assert '(Isa (ExplainILO (ShapeOf (setof "ethane*" "ethene*" "benzene*")) ) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (ShapeOf (setof "ethane*" "ethene*" "benzene*")) ) (inTermsOf "σ and π carbon-carbon bonds")))
 ;; 161. Describe structural isomerism, and its division into chain, positional and functional group isomerism.
 (assert '(Isa (DescribeILO (setof "structural isomerism*" "chain isomerism*" "positional isomerism*" "functional group isomerism*")) "ILO class*"))
 ;; 162. Describe stereoisomerism, and its division into geometrical (cis-trans) and optical isomerism.
 (assert '(Isa (DescribeILO (setof "stereoisomerism*" "geometrical isomerism*" "optical isomerism*")) "ILO class*"))
 ;; 163. Describe cis-trans isomerism in alkenes, and explain its origin in terms of restricted rotation due to the presence of π bonds.
 (assert '(Isa (DescribeILO "cis-trans isomerism*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "cis-trans isomerism*") (inTermsOf "restricted rotation due to the presence of π bonds")))
 ;; 164. Explain what is meant by a chiral centre and that such a centre gives rise to optical isomerism.
 (assert '(Isa (DescribeILO "chiral centre*") "ILO class*"))
 (assert '(Isa (ExplainHowILO (GivesRiseTo "chiral centre*" "optical isomerism*")) ))
 ; 165. Identify chiral centres and/or cis-trans isomerism in a molecule of given structural formula.
 (assert '(Isa (IdentifyILO (every x (isChiralCentreOf x y) (Isa y "organic molecule class*") (Given (StructuralFormulaOf y))))  "ILO class*"))
 (assert '(Isa (IdentifyILO (every x (isGeometricIsomerOf x y) (Isa y "organic molecule class*") (Given (StructuralFormulaOf y))))  "ILO class*"))
  ; 166. Deduce the possible isomers for an organic molecule of known molecular formula.
 (assert '(Isa (DeduceILO (every x (isIsomerOf x y) (Isa y "organic molecule class*") (Given (TypedFormulaOf "structural formula" y)))) "ILO class*"))
 ; 167. Deduce the molecular formula of a compound, given its structural, displayed or skeletal formula (see Section 1).
 (assert '(Isa (DeduceILO ( (every x (hasMolecularFormula y x) (Given (TypedFormulaOf "structural formula*" y))))))  "ILO class*"))
 ;; 168. Show awareness of the general unreactivity of alkanes, including towards polar reagents.
 (assert '(Isa (CommentOnILO (ReactivityOf (every x (Isa x "alkane substance class*") ) )) "ILO class*"))
 (assert '(Reactivitywith (ReactivityOf (every x (Isa x "alkane substance class*") ) ) (every y (Isa y "polar reagent class*") )
 ;; 169. Describe the chemistry of alkanes as exemplified by the following reactions of ethane: (i) combustion (ii) substitution by chlorine and by bromine.
 (assert '(Isa (DescribeILO  (ChemistryOf (every x (Isa x "alkane substance class*")))) "ILO class*"))
 (assert '(ILOQualifier (ChemistryOf (every x (Isa x "alkane substane class*"))) (asExemplifiedBy (setof (CombustionOf ethane) "substitution by chlorine and by bromine in ethane")))))
 ;; 170. Describe the mechanism of free-radical substitution at methyl groups with particular reference to the initiation, propagation and termination reactions.
 (assert '(Isa (DescribeILO (MechanismOf "free-radical substitution*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "free-radical substitution*") (withReferenceTo (setof "initiation reaction*" "propagation reaction*" "termination reaction*"))))
 ; 171. Describe the chemistry of alkenes as exemplified, where relevant, by the following reactions of ethene and propene (including the Markovnikov addition of asymmetric electrophiles to propene): (i) addition of hydrogen, steam, hydrogen halides and halogens (ii) oxidation by cold, dilute, acidified manganate(VII) ions to form the diol (iii) oxidation by hot, concentrated, acidified manganate(VII) ions leading to the rupture of the carbon-to-carbon double bond in order to determine the position of alkene linkages in larger molecules (iv) polymerisation (see also Section 10.8).
 (assert '(Isa (DescribeILO (ChemistryOfClass "alkene substance class*") "ILO class*"))
 (assert '(Isa (DescribeILO (AdditionReaction "hydrogen molecular substance*" "ethene molecular substance*") "ILO class*"))
 (assert '(Isa (DescribeILO (AdditionReaction "steam*" "ethene molecular substance*") "ILO class*"))
 (assert '(Isa (DescribeILO (AdditionReaction (every x (Isa x "hydrogen halide substance class*")) "ethene molecular substance*")) "ILO class*"))
 (assert '(Isa (DescribeILO (AdditionReaction "hydrogen molecular substance*" "propene molecular substance*") "ILO class*"))
 (assert '(Isa (DescribeILO (AdditionReaction "steam*" "propene molecular substance*") "ILO class*"))
 (assert '(Isa (DescribeILO (AdditionReaction (every x (Isa x "hydrogen halide substance class*")) "propene molecular substance*")) "ILO class*"))
 ; 172. Describe the mechanism of electrophilic addition in alkenes, using bromine/ethene and hydrogen bromide/propene as examples.
 (assert '(Isa (DescribeILO (MechanismOfReactionType "electrophilic addition*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (MechanismOfReactionType "electrophilic addition*")) (setof (forSubstrateClass "alkene substance class*") (withExample (ReactionBetween "bromine element*" "ethene substance*")))))
 (assert '(ILOQualifier (DescribeILO (MechanismOfReactionType "electrophilic addition*")) (setof (forSubstrateClass "alkene substance class*") (withExample (ReactionBetween "bromide ion species*" "propene substance*")))))
 ; 173. Explain the use of crude oil as a source of both aliphatic and aromatic hydrocarbons.
 (assert '(Isa (DescribeILO (UseOfFor "crude oil*" (ProductionOfClass "aliphatic hydrocarbon class*")))) "ILO class*"))
 (assert '(Isa (DescribeILO (UseOfFor "crude oil*" (ProductionOfClass "aromatic hydrocarbon class*")))) "ILO class*"))
 ; 174. Suggest how 'cracking' can be used to obtain more useful alkanes and alkenes of lower Mr from larger hydrocarbon molecules.
 (assert '(Isa (DescribeILO "catalytic cracking*") "ILO class*"))
 ; 175. Describe and explain how the combustion reactions of alkanes lead to their use as fuels in industry, in the home and in transport.
 (assert '(Isa (DescribeILO (UseOf (TypedReactionOfClass "combustion*" "alkane substance class*"))) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (UseOf (TypedReactionOfClass "combustion*" "alkane substance class*"))) (inContext "industry*")))
 (assert '(ILOQualifier (DescribeILO (UseOf (TypedReactionOfClass "combustion*" "alkane substance class*"))) (inContext "the home*")))
 (assert '(ILOQualifier (DescribeILO (UseOf (TypedReactionOfClass "combustion*" "alkane substance class*"))) (inContext "transport*")))
 (assert '(Isa (ExplainILO (UseOf (TypedReactionOfClass "combustion*" "alkane substance class*"))) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (UseOf (TypedReactionOfClass "combustion*" "alkane substance class*"))) (inContext "industry*")))
 (assert '(ILOQualifier (ExplainILO (UseOf (TypedReactionOfClass "combustion*" "alkane substance class*"))) (inContext "the home*")))
 (assert '(ILOQualifier (ExplainILO (UseOf (TypedReactionOfClass "combustion*" "alkane substance class*"))) (inContext "transport*")))
 ; 176. Recognise the environmental consequences of: (i) carbon monoxide, oxides of nitrogen and unburnt hydrocarbons arising from the internal combustion engine and of their catalytic removal (ii) gases that contribute to the enhanced greenhouse effect.
 (assert '(Isa (DescribeILO (EffectOfOn "carbon monoxide*" "atmosphere")) "ILO class*"))
 (assert '(ILOQualifier (EffectOfOn "carbon monoxide*" "atmosphere")) (inTermsOf (EffectOn "the environment*")))
 (assert '(Isa (DescribeILO (EffectOfOn "nitrogen oxides class*" "atmosphere")) "ILO class*"))
 (assert '(ILOQualifier (EffectOfOn "nitrogen oxides class*" "atmosphere")) (inTermsOf (EffectOn "the environment*")))
 (assert '(Isa (DescribeILO (EffectOfOn "hydrocarbon class*" "atmosphere")) "ILO class*"))
 (assert '(ILOQualifier (EffectOfOn "hydrocarbon class*" "atmosphere")) (inTermsOf (EffectOn "the environment*")))
 ;; 177. Describe the chemistry of arenes as exemplified by the following reactions of benzene and methylbenzene:(i) substitution reactions with chlorine and with bromine (ii) nitration (iii) complete oxidation of the side-chain to give a benzoic acid(iv) hydrogenation of the benzene ring to form a cyclohexane ring.
 (assert '(Isa (DescribeILO (ChemistryOfClass "arene molecular substance class*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (ChemistryOfClass "arene molecular substance class*"))  (asExemplifiedBy (setof "substitution reactions with chlorine and with bromine" "nitration" "complete oxidation of the side-chain to give a benzoic acid" "hydrogenation of the benzene ring to form a cyclohexane ring")))
 ; 178. Describe the mechanism of electrophilic substitution in arenes, as exemplified by the formation of nitrobenzene and bromobenzene.
 (assert '(Isa (DescribeILO (MechanismOf (ReactionTypeofClass "electrophilic substitution*""arene molecular substance class*"))) "ILO class*"))
 ; 179. Suggest the mechanism of other electrophilic substitution reactions, given data.
 (assert '(Isa (SuggestILO (MechanismOfReactionType "electrophilic substitution*")) "ILO class*"))
 (assert '(ILOQualifier (SuggestILO (MechanismOfReactionType "electrophilic substitution*")) (inSystem 
 ; 180. Describe the effect of the delocalisation of electrons in arenes in such reactions.
 (assert '(Isa (DescribeILO (EffectOfOn "electron delocalisation*" (ElectrophilicSubstitutionofClass "arene molecular substance class*"))) "ILO class*"))
 ; 181. Predict whether halogenation will occur in the side-chain or aromatic nucleus in arenes depending on reaction conditions.
 (assert '(Isa (PredictILO (ReactionSite )) "ILO class*"))
 ; 182. Apply the knowledge of positions of substitution in the electrophilic substitution of arenes.
 (assert '(Isa (DescribeILO (EffectOfOn "position of substitution*" (ReactionTypeofClass "electrophilic substitution*" "arene molecular substance class*"))) "ILO class*"))
 ; 183. Recall the chemistry of halogenoalkanes as exemplified by (i) the following nucleophilic substitution reactions of bromoethane: hydrolysis, formation of nitriles, formation of primary amines by reaction with ammonia (ii) the elimination of hydrogen bromide from 2-bromopropane.
 (assert '(Isa (DescribeILO (ChemistryOfClass "haloalkane substance class*") "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionTypeOnSubstrate "hydrolysis reaction class*"  "bromoethane molecular substance*") "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionTypeOnSubstrate "nitrile formation reaction class*"  "bromoethane molecular substance*") "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionTypeOnSubstrate "primary amine formation reaction class*"  "bromoethane molecular substance*") "ILO class*"))
 (assert '(Isa (DescribeILO (EliminationTypeOnSubstrate "elimination reaction class*" "hydrogen bromide molecular substance*" "2-bromopropane molecular substance*") "ILO class*"))
 ; 184. Describe the mechanism of nucleophilic substitution (by both SN1 and SN2 mechanisms) in halogenoalkanes.
 (assert '(Isa (DescribeILO (ReactionTypeofClass "sn1 nucleophilic substitution*" "halogenoalkane molecular substance class*") "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionTypeofClass "sn1 nucleophilic substitution*" "halogenoalkane molecular substance class*") "ILO class*"))
 ; 185. Interpret the different reactivities of halogenoalkanes and chlorobenzene (with particular reference to hydrolysis and to the relative strengths of the C-Hal bonds).
 (assert '(Isa (InterpretILO (DifferenceBetween (ReactivityOfClass "halogenoalkane substance class*") (ReactivityOf "chlorobenzene molecular substancce*")) "ILO class*"))
 ; 186. Explain the uses of fluoroalkanes and fluorohalogenoalkanes in terms of their relative chemical inertness.
 (assert '(Isa (ExplainILO (UseOf "fluoroalkane substance class*")) "ILO class*"))
 (assert '(Isa (ExplainILO (UseOf "fluorohalogenoalkane substance class*")) "ILO class*"))
 (assert '(ILOQualifier (UseOf "fluoroalkane substance class*") (inTermsOf (QualifiedProperty "relative" "chemical inertness*"))))
 ; 187. Recognise the concern about the effect of chlorofluoroalkanes on the ozone layer.
 (assert '(Isa (DiscussILO (EffectOfOn "chlorofluoroalkane substance class*" "ozone layer*"))) "ILO class*"))
 ; 188. Recall the chemistry of alcohols, exemplified by ethanol: (i) combustion (ii) substitution to give halogenoalkanes (iii) reaction with sodium (iv) oxidation to carbonyl compounds and carboxylic acids (v) dehydration to alkenes (vi) formation of esters by esterification with carboxylic acids and acylation with acyl chlorides.
 (assert '(Isa (SummariseILO (ChemistryOfClass "alcohol substance class")) "ILO class*"))
 (assert '(ILOQualifier (SummariseILO (ChemistryOfClass "alcohol substance class")) (setof (asExemplifiedBy "ethanol substance*") (Including "combustion*"))
 ; 189. Classify hydroxy compounds into primary, secondary and tertiary alcohols (ii) suggest characteristic distinguishing reactions, e.g. mild oxidation.
 (assert '(Isa (ClassifyILO "hydroxy substance class*") "ILO class*"))
 (assert '(ILOQualifier (ClassifyILO "hydroxy substance class*") (ClassificationCategories "primary alcohol class*" "secondary alcohol class*" "tertiary alcohol class*")))
 ; 190. Deduce the presence of a CH3CH(OH)– group in an alcohol from its reaction with alkaline aqueous iodine to form tri-iodomethane
 (assert '(Isa (DeduceILO (hasGroup "ethyl alcohol group*" (some x ()  (Isa x "alcohol molecule class*")))) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (hasGroup "ethyl alcohol group*" (some x ()  (Isa x "alcohol molecule class*")))) (fromEvidence "iodoform reaction*")))
 ; 191. Recall the chemistry of phenol, as exemplified by the following reactions: (i) with bases (ii) with sodium (iii) with diazonium salts (Section 10.7) (iv) nitration of, and bromination of, the aromatic ring.
 (assert '(Isa (SummariseILO (ChemistryOf "phenol substance*")) "ILO class*"))
 (assert '(ILOQualifier (SummariseILO (ChemistryOf "phenol substance*")) (asExemplifiedBy (setof (ReactionBetween "phenol substance*" (every x (Isa x "base class*")))))
 ; 192. Describe and explain the relative acidities of water, phenol and ethanol.
 (assert '(Isa (DescribeILO (NamedRelativePropertyOf "acidity*" (setof "water substance*" "phenol substance*" "ethanol substance*"))) "ILO class*"))
 ; 193. Describe (i) the formation of aldehydes and ketones from primary and secondary alcohols respectively using Cr2O7? 2–/H+ (ii) the reduction of aldehydes and ketones e.g. using NaBH4 or LiAlH4? (iii) the reaction of aldehydes and ketones with HCN and NaCN.
 (assert '(Isa (DescribeILO (TypedReactionOfClass "formation*" "aldehyde substance class*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (TypedReactionOfClass "formation*" "aldehyde substance class*")) (setof (fromPrecursorClass (TypedReactionOfClass "formation*" "aldehyde substance class*") "primary alcohol substance class*") (inConditions (TypedReactionOfClass "formation*" "aldehyde substance class*")  "acidified potassium dichromate*"))))
 ; 194. Describe the mechanism of the nucleophilic addition reactions of hydrogen cyanide with aldehydes and ketones.
 (assert '(Isa (DescribeILO (MechanismOf (TypedReactionWithClass "nucleophilic addition*" "hydrogen cyanide substance*" "aldehyde substance class*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (MechanismOf (TypedReactionWithClass "nucleophilic addition*" "hydrogen cyanide substance*" "ketone substance class*"))) "ILO class*"))
 ; 195. Describe the use of 2,4-dinitrophenylhydrazine (2,4-DNPH) reagent to detect the presence of carbonyl compounds.
 (assert '(Isa (UseOfAs "2,4-dinitrophenylhydrazine substance*" (TestForClass "carbonyl substance class*") "ILO class*"))
 ; 196. Deduce the nature (aldehyde or ketone) of an unknown carbonyl compound from the results of simple tests (i.e. Fehling’s and Tollens’ reagents; ease of oxidation).
 (assert '(Isa (InterpretILO (ResultOf x (isFunctionalGroupTestFor  x "aldehyde substance class*")))) "ILO class*"))
 (assert '(Isa (InterpretILO (ResultOf x (isFunctionalGroupTestFor  x "ketone substance class*")))) "ILO class*"))
 ; 197. Describe the reaction of CH3CO– compounds with alkaline aqueous iodine to give tri-iodomethane.
 (assert '(Isa (DescribeILO "iodoform reacion*") "ILO class*"))
 ; 198. Describe the formation of carboxylic acids from alcohols, aldehydes and nitriles.
 (assert '(Isa (DescribeILO (TypedReactionOfClass "formation*" "carboxylic acid substance class*"))) "ILO class*"))
 ; 199. Describe the reactions of carboxylic acids in the formation of (i) salts, by the use of reactive metals, alkalis or carbonates (ii) esters (iii) acyl chlorides.
 (assert '(Isa (DescribeILO (ChemicalReactionsOf "carboxylic acid substance class*"))) "ILO class*"))
 (assert '(ILOModifier (DescribeILO (ChemicalReactionsOf "carboxylic acid substance class*")) (ChemicalReactionsOf "carboxylic acid substance class*") (inFormationOfClass "carboxylic acid salt substance class*")))
 (assert '(ILOModifier (DescribeILO (ChemicalReactionsOf "carboxylic acid substance class*")) (ChemicalReactionsOf "carboxylic acid substance class*") (inFormationOfClass "ester  substance class*")))
 (assert '(ILOModifier (DescribeILO (ChemicalReactionsOf "carboxylic acid substance class*")) (ChemicalReactionsOf "carboxylic acid substance class*") (inFormationOfClass "acyl chloride substance class*")))
 ; 200. Explain the acidity of carboxylic acids and of chlorinesubstituted ethanoic acids in terms of their structures.
 (assert '(Isa (ExplainILO (NamedPhysicalPropertyOfClass "acidity*" "carboxylic acid class*")) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (NamedPhysicalPropertyOfClass "acidity*" "carboxylic acid class*")) (inTermsOf "structure*")))
 ; 201. Describe the hydrolysis of acyl chlorides.
 (assert '(Isa (DescribeILO (ClassReactionOf "hydrolysis*" "acyl chloride molecular substance class*")) "ILO class*"))
  ; 202. Describe the reactions of acyl chlorides with alcohols, phenols and primary amines.
 (assert '(Isa (DescribeILO (ReactionBetweenClass "acyl chloride substance class*" "alcohol substance class*") "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionBetweenClass "acyl chloride substance class*" "phenol substance class*") "ILO class*"))
 (assert '(Isa (DescribeILO (ReactionBetweenClass "acyl chloride substance class*" "primary amine substance class*") "ILO class*"))
 ; 203. Explain the relative ease of hydrolysis of acyl chlorides, alkyl chlorides and aryl chlorides.
 (assert '(Isa (ExplainILO (NamedRelativePropertyOf "ease*" (TypedReactionOfClass "hydrolysis*" "acyl chloride substance class*"))) "ILO class*"))
 ; 204. Describe the formation of esters from carboxylic acids or acyl chlorides, using ethyl ethanoate and phenyl benzoate as examples.
 (assert '(Isa (DescribeILO (TransformationReactionOfClass "ester substance class*" "carboxylic acid substance class*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (TransformationReactionOfClass "ester substance class*" "carboxylic acid substance class*")) (withExamples (setof "ethyl ethanoate substance*" "phenyl benzoate*"))))
 (assert '(Isa (DescribeILO (TransformationReactionOfClass "ester substance class*" "acyl chloride substance class*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (TransformationReactionOfClass "ester substance class*" "acyl chloride substance class*")) (withExamples (setof "ethyl ethanoate substance*" "phenyl benzoate*"))))
 ; 205. Describe the acid and base hydrolysis of esters.
 (assert '(Isa (DescribeILO (TypedReactionOfClass "acid hydrolysis*" "ester substance class*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (TypedReactionOfClass "base hydrolysis*" "ester substance class*"))) "ILO class*"))
 ; 206. State the major commercial uses of esters e.g. solvents, perfumes, flavourings. describe the formation of polyesters (see also Section 10.8).
 (assert '(Isa (StateILO (UseOf "ester substance class*")) "ILO class*"))
 (assert '(ILOModifier (StateILO (UseOf "ester substance class*") (UseOf "ester substance class*") (inDomain "commerce*")))))
 (assert '(DescribeILO (TypedReactionOfClass "formation*" "polyester substance class*")))
 ; 207. Describe the formation of alkyl amines such as ethylamine (by the reaction of ammonia with halogenoalkanes; the reduction of amides with LiAlH4?; the reduction of nitriles with LiAlH4? or H2/Ni) and of phenylamine (by the reduction of nitrobenzene with tin/concentrated HCl).
 (assert '(Isa (DescribeILO (TypedReactionOfClass "formation*" "alkyl amine substance class*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (TypedReactionOfClass "formation*" "alkyl amine substance class*")) (byReactionOf (TypedReactionOfClass "formation*" "alkyl amine substance class*") (setof "ammonia substance*" "halogenoalkane substance class*"))))
 (assert '(ILOQualifier (DescribeILO (TypedReactionOfClass "formation*" "alkyl amine substance class*")) (byReactionOf (TypedReactionOfClass "formation*" "alkyl amine substance class*") (setof "lithium aluminium hydride substance*" "nitrile  substance class*"))))
 (assert '(ILOQualifier (DescribeILO (TypedReactionOfClass "formation*" "alkyl amine substance class*")) (byReactionOf (TypedReactionOfClass "formation*" "alkyl amine substance class*") (setof "lithium aluminium hydride substance*" "amide substance class*"))))
 (assert '(Isa (DescribeILO (TypedReactionOf "formation*" "phenylamine substance*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (TypedReactionOf "formation*" "phenylamine substance*")) (byReactionOf (TypedReactionOf "formation*" "phenylamine substance*") (setof "nitrobenzene substance*" "tin element*" "concentrated hydrochloric acid substance*"))))
 ; 208. Describe and explain the basicity of amines.
 (assert '(Isa (DescribeILO (NamedPropertyOfClass "basicity*" "amine substance class*")) "ILO class*"))
 (assert '(Isa (ExplainILO (NamedPropertyOfClass "basicity*" "amine substance class*")) "ILO class*"))
 ; 209. Explain the relative basicities of ammonia, ethylamine and phenylamine in terms of their structures.
 (assert '(Isa (ExplainILO (NamedRelativeProperty "basicity*" (setof "ammonia substance*" "ethylamine substance*" "phenylamine substance*"))) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (NamedRelativeProperty "basicity*" (setof "ammonia substance*" "ethylamine substance*" "phenylamine substance*"))) (inTermsOf "molecular structure*")))
 ; 210. Describe the reaction of phenylamine with: (i) aqueous bromine (ii) nitrous acid to give the diazonium salt and phenol.
 (assert '(Isa (DescribeILO (ChemicalReactionBetween (setof "phenylamine substance*" "aqueous bromine solution*") (setof "diazonium salt*" "phenol substance*"))  "ILO class*"))
 (assert '(Isa (DescribeILO (ChemaicalRactionBetween (setof "phenylamine substance*" "nitrous acid substance*") (setof "diazonium salt*" "phenol substance*"))) "ILO class*"))
 ; 211. Describe the coupling of benzenediazonium chloride and phenol and the use of similar reactions in the formation of dyestuff.
 (assert '(Isa (DescribeILO (TypedReactionBetween "coupling*" (setof "benzenediazonium chloride substance*" "phenol substance*"))) "ILO class*"))
 (assert '(Isa (DescribeILO (UseOfFor (every x (Isa x "chemical reaction class*")) (isSimilarTo x (TypedReactionBetween "coupling*" (setof "benzenediazonium chloride substance*" "phenol substance*"))) (TypedReactionOfClass "formation*" "dyestuff class*"))) "ILO class*"))
  ; 212. Describe the formation of amides from the reaction between RNH2 and R’COCl.
 (assert '(Isa (DescribeILO (TypedReactionOfClass "formation*" "amide substance class*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (TypedReactionOfClass "formation*" "amide class*") (withMeans (TypedReactionOfClass "formation*" "amide class*") (ReactionBetween "primary amine class*" "acyl chloride class*")))))
 ; 213. Recognise that amides are neutral.
 (assert '(Isa (RecogniseILO (every x (Isa x "amide substance class*") (Isa x "neutral substance class*"))))) "ILO class*"))
 ; 214. Describe amide hydrolysis on treatment with aqueous alkali or acid (ii) describe the reduction of amides with LiAlH4? (i) describe the acid/base properties of amino acids and the formation of zwitterions.
 (assert '(Isa (DescribeILO (TypedChemicalReactionOfClass "hydrolysis*" "amide substance class*")) "ILO class*"))
 ; 215. Describe the formation of peptide bonds between amino acids and, hence, explain protein formation
 (assert '(Isa (ExplainILO (TypedChemicalReactionOfClass "formation*" "protein substance class*")) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (TypedChemicalReactionOfClass "formation*" "protein substance class*")) (inTermsOf ))
 ; 216. Describe the hydrolysis of proteins.
 (assert '(Isa (DescribeILO (TypedChemicalReactionOfClass "hydrolysis*" "protein substance class*")) "ILO class*"))
 ; 217. Describe the formation of polyamides (see also Section 10.8).
 (assert '(Isa (DescribeILO (TypedChemicalReactionOfClass "formation*" "polyamide substance class*")) "ILO class*")) 
 ; 218. Describe the characteristics of addition polymerisation as exemplified by poly(ethene) and PVC.
 (assert '(Isa (DescribeILO (CharacteristicsOf "addition polymerisation*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (CharacteristicsOf "additionpolymerisation*")) (asExemplifiedBy "polyethene*")))
 (assert '(ILOQualifier (DescribeILO (CharacteristicsOf "additionpolymerisation*")) (asExemplifiedBy "PVC*")))
 ; 219. Recognise the difficulty of the disposal of poly(alkene)s, i.e. nonbiodegradability and harmful combustion products.
 (assert '(Isa (RecogniseILO (DifficultyOf (NamedProcessOfClass "disposal*" "polyalkene class*" ))) "ILO class*")) 
 ; 220. Describe the characteristics of condensation polymerisation (i) in polyesters as exemplified by Terylene (ii) in polyamides as exemplified by peptides, proteins, nylon 6 and nylon 6,6.
 (assert '(Isa (DescribeILO (CharacteristicsOf "condensation polymerisation*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (CharacteristicsOf "condensation polymerisation*")) (setof (withReferenceTo "polyester polymer class*") (asExemplifiedBy "Terylene*"))))
 (assert '(ILOQualifier (DescribeILO (CharacteristicsOf "condensation polymerisation*")) (setof (withReferenceTo "polyamide polymer class*") (asExemplifiedByClass "peptide class*"))))
 (assert '(ILOQualifier (DescribeILO (CharacteristicsOf "condensation polymerisation*")) (setof (withReferenceTo "polyamide polymer class*") (asExemplifiedByClass "protein class*"))))
 (assert '(ILOQualifier (DescribeILO (CharacteristicsOf "condensation polymerisation*")) (setof (withReferenceTo "polyamide polymer class*") (asExemplifiedBy "nylon 6*"))))
 (assert '(ILOQualifier (DescribeILO (CharacteristicsOf "condensation polymerisation*")) (setof (withReferenceTo "polyamide polymer class*") (asExemplifiedBy "nylon 6,6*"))))
 ; 221. Predict the type of polymerisation reaction for a given monomer or pair of monomers.
 (assert '(Isa (PredictILO (TypeOf "polymerisation*")) "ILO class*"))
 (assert '(ILOQualifier (PredictILO (TypeOf "polymerisation*")) (Given "monomer*")))
 (assert '(ILOQualifier (PredictILO (TypeOf "polymerisation*")) (Given (PairOf "monomer*"))))
 ; 222. Deduce the repeat unit of a polymer obtained from a given monomer or pair of monomers.
 (assert '(Isa (DeduceILO (NamedPropertyOfClass "mer*" "polymer class*")) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (NamedPropertyOfClass "mer*" "polymer class*")) (Given "monomer*")))
 (assert '(ILOQualifier (DeduceILO (NamedPropertyOfClass "mer*" "polymer class*")) (Given (PairOf "monomer*"))))
 ; 223. Deduce the type of polymerisation reaction which produces a given section of a polymer molecule.
 (assert '(Isa (DeduceILO (TypeOf "polymerisation reaction*")) "ILO class*"))
 (assert '(ILOQualifier (DeduceILO (TypeOf "polymerisation reaction*")) (Given (ArbitraryTypedPartOfClass "section" "polymer class*"))))
 ; 224. Identify the monomer(s) present in a given section of a polymer molecule.
 (assert '(Isa (IdentifyILO (every x (Isa x "mer class*") (isPresentIn x  (ArbitraryTypedPartOfClass "section" "polymer class*")))))) "ILO class*"))
 ; 225. Recall that proteins are condensation polymers formed from amino acid monomers and recognise and describe the generalised structure of amino acids (link to core syllabus, sections 10.7 and 10.8).
 (assert '(Isa (RecallILO (Isa (every x (Isa x "protein class*")) "condensation polymer class*")) "ILO class*"))
 ; 226. Explain the importance of amino acid sequence (primary structure) in determining the properties of proteins.
 (assert '(Isa (ExplainILO (NamedAspectOf "importance*" "primary structure*")) "ILO class*"))
 ; 227. Distinguish between the primary, secondary (α-helix and β-sheet) and tertiary structures of proteins and explain the stabilisation of secondary (through hydrogen bonding between C=O and N-H bonds of peptide groups) and tertiary (through interactions between R-groups) structure using the chemistry learnt in the core syllabus, sections 3 and 10.7.
 (assert '(Isa (DistinguishBetweenILO ("protein primary structure*" "protein secondary structure*" "protein tertiary structure*")) "ILO class*"))
 (assert '(Isa (ExplainILO (StabilisationOfBy "protein secondary structure*" "hydrogen bonding*")) "ILO class*"))
 (assert '(Isa (ExplainILO (StabilisationOfBy "tertiary secondary structure*" "hydrophobic interaction*")) "ILO class*"))
 ; 228. DescribeILO and explain the characteristics of enzyme catalysis, including (i) specificity (using a simple lock and key model) and the idea of competitive inhibition (ii) structural integrity in relation to denaturation and noncompetitive inhibition.
 (assert '(Isa (DescribeILO "enzyme catalysis*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "enzyme catalysis*") (Including (setof "specificity*" "competitive inhibition*"))))
 (assert '(ILOQualifier (DescribeILO "enzyme catalysis*") (Including (setof "denaturation*" "non-competitive inhibition*"))))
 ; 229. Given information, use core chemistry to explain how small molecules interact with proteins and how they can modify the structure and function of biological systems (for example, as enzyme inhibitors or cofactors, disrupting protein-protein interactions, blocking ion channels) (link to 11.3 (a)).
 (assert '(Isa (ExplainILO (EffectOfTo (InteractionOf "small molecule class*" "protein substance class*") (AlterPropertyOf "modify*" (setof "structure*" "function*") "biological system*" ))) "ILO class*"))
 ; 230.  Describe the double helical structure of DNA in terms of a sugar-phosphate backbone and attached bases (Candidates will be expected to know the general structure in terms of a block diagram but will not be expected to recall the detailed structures of the components involved. Where these are required they will be given in the question paper.)
 (assert '(Isa (DescribeILO (TypedStructureOf "double helix*" "DNA*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (TypedStructureOf "double helix*" "DNA*")) (inTermsOf "sugar-phosphate bacbone and attached bases*")))
 ; 231. Explain the significance of hydrogen-bonding in the pairing of bases in DNA in relation to the replication of genetic information.
 (assert '(Isa (ExplainILO (NamedAspectOf "significance*" "hydrogen bonding*")) "ILO class*"))
 (assert '(ILOQualifier (ExplainILO (NamedAspectOf "significance*" "hydrogen bonding*")) (inRelationTo (setof "DNA base pairing*" "replication of genetic information*"))))
 ; 232. Explain in outline how DNA encodes for the amino acid sequence of proteins with reference to mRNA, tRNA and the ribosome in translation and transcription.
 (assert '(Isa (ExplainHowILO "DNA encodes for the amino acid sequence of proteins*") "ILO class*"))
 (assert '(ILOQualifier (ExplainHowILO "DNA encodes for the amino acid sequence of proteins*") (setof (withReferenceTo (setof "messenger rna*" "transfer rna*" "ribosome*")) (inDomain (setof "translation*" "transcription*")))))
  ; 233. Explain the chemistry of DNA mutation from provided data.
 (assert '(Isa (ExplainILO (ChemistryOfProcess "DNA mutation*")) "ILO class*"))
 ;; 234. Discuss the genetic basis of disease (for example, sickle cell anaemia) in terms of altered base sequence, causing alterations in protein structure and function.
 (assert '(Isa (DiscussILO "genetic basis of disease*") "ILO class*"))
 (assert '(ILOQualifier (DiscussILO "genetic basis of disease*") (setof (forExample "sickle cell anaemia*") (inTermsOf "causing alterations in protein structure and function and altered base sequence*"))))
   ; 235 Explain how modification to protein/enzyme primary structure can result in new structure and/or function.
 (assert '(Isa (ExplainHowILO (ResultsIn (ModificationOf "protein primary structure*" "new structure and/or function*"))) "ILO class*"))
 ; 236. Outline, in terms of the hydrolysis of ATP to ADP + Pi , the provision of energy for the cell.
 (assert '(Isa (OutlineILO "provision of energy for the cell*") "ILO class*"))
 ; 237. Understand why some metals are essential to life and, given information and with reference to the chemistry of the core syllabus, be able to explain the chemistry involved (for example, iron in haemoglobin (section 9.5 (g) and 11.1(e) and (j)), sodium and potassium in transmission of nerve impulses (section 3, ion solvation and section 5, energetics), zinc as an enzyme cofactor (section 10.1, nucleophilic attack, 11.1(e))).
 (assert '(Isa (UnderstandWhyILO (isEssentialTo  (some y ()  (Isa y "metal class*")) "life*")) "ILO class*"))
 ; 238. Recognise that some metals are toxic and discuss, in chemical terms, the problems associated with heavy metals in the environment entering the food chain, for example mercury (development of methods to detect and address these problems will be discussed in 11.2(i) and 11.3(f)).
 (assert '(Isa (RecogniseThatILO (isToxic (some x (Isa x "metal class*")) ) "ILO class*"))
 (assert '(Isa (DiscussILO (NamedAspectOf "problem*" (Entering (every x (Isa x "heavy metal class*") (IsIn x "environment*")) "food chain*"))) "ILO class*"))
 ; 239. Describe simply the process of electrophoresis and the effect of pH, using peptides and amino acids as examples (link to 11.1 (a)).
 (assert '(Isa (DescribeILO "electrophoresis*") "ILO class*"))
 (assert '(ILOQualifier  (DescribeILO "electrophoresis*") (inManner "simply*"))
 (assert '(Isa (DescribeILO (EffectOfOn "pH*" "electrophoresis*")) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (EffectOfOn "pH*" "electrophoresis*")) (usingAsExample )(setof "peptide class*" "amino acid class*")))
 ; 240 . Explain, in simple terms, the technique of DNA fingerprinting and its applications in forensic science, archaeology and medicine.
 (assert '(Isa (DescribeILO "DNA fingerprinting*") "ILO class*"))
 (assert '(ILOQualifier (DescribeILO "DNA fingerprinting*") (inManner "simply*")))
 (assert '(Isa (DescribeILO (NamedAspectOf "applications*" "DNA fingerprinting*")) "ILO class*"))
 ; 241. Describe the importance to modern medicine, and the challenges, of separating and characterising the proteins in cells (link to 11.1).
 (assert '(Isa (DescribeILO (NamedAspectOf "importance*" (SeparationOf "cell protein class*") (CharacterisationOf "cell protein class*"))) "ILO class*"))
 (assert '(ILOQualifier (DescribeILO (NamedAspectOf "importance*" (SeparationOf "cell protein class*") (CharacterisationOf "cell protein class*"))) (inDomain "medicine*")))
 ; 242. Outline in simple terms the principles of nuclear magnetic resonance in 1H and be able to interpret simple NMR spectra, using chemical shift values, splitting patterns and the effect of adding D2O to a sample.
 (assert '(Isa (OutlineILO (NamedAspectOf "principle class*" "proton nuclear magnetic resonace*")) "ILO class*"))
 ; 243. Show awareness of the use of NMR and X-ray crystallography in determining the structure of macromolecules and in understanding their function (link to 11.1 (c) and 11.2 (c))
 (assert '(Isa (ShowAwarenessOfILO (UseOfFor "NMR spectroscopy*" (DeterminationOf (AspectOf "structure*""macromolecule class*")))) "ILO class*"))
 (assert '(Isa (ShowAwarenessOfILO (UseOfFor "x-ray crystallography*" (DeterminationOf (Aspectof "structure*" "macromolecule class*")))) "ILO class*"))
 (assert '(Isa (ShowAwarenessOfILO (UseOfFor "NMR spectroscopy*" (UnderstandingOf (AspectOf function* "macromolecule class*")))) "ILO class*"))
 (assert '(Isa (ShowAwarenessOfILO (UseOfFor "x-ray crystallography*" (UnderstandingOf (AspectOf function* "macromolecule class*")))) "ILO class*"))
 ; 244. State what is meant by partition coefficient and calculate a partition coefficient for a system in which the solute is in the same molecular state in the two solvents
 (assert '(Isa (DefineILO "partition coefficient*") "ILO class*"))
 ;; 245. Understand qualitatively paper, high performance liquid, thin layer and gas/liquid chromatography in terms of adsorption and/or partition and be able to interpret data from these techniques.
 (assert '(Isa {UnderstandILO (setof "paper chromatography*" "high performance liquid chromatography*" "thin layer chromatography*" "gas/liquid chromatography*")) "ILO class*"))
 (assert '(ILOQualifier {UnderstandILO (setof "paper chromatography*" "high performance liquid chromatography*" "thin layer chromatography*" "gas/liquid chromatography*")) (inManner qualitatively*)))
  ; 246. Explain the concept of mass spectroscopy, deduce the number of carbon atoms in a compound using the M+1 peak and the presence of bromine and chlorine atoms using the M+2 peak and suggest the identity of molecules formed by simple fragmentation in a given mass spectrum (see also core syllabus, section 1 (c) and (d)).
 (assert '(Isa (ExplainILO "mass spectrometry*") "ILO class*"))
 ; 247. Draw conclusions given appropriate information and data from environmental monitoring (for example, PCBs in the atmosphere, isotopic ratios in ice cores).
 ;;; poor ILO
 ; 248. Discuss the challenges of drug design and explain in simple terms how molecules may be identified and developed to overcome these problems
 (assert '(Isa (DiscussILO (NamedAspectOf challenge* "drug design*")) "ILO class*"))
 ; 249. Discuss the challenges of drug delivery and explain in simple terms how materials may be developed to overcome these problems.
 (assert '(Isa ((DiscussILO (NamedAspectOf challenge* "drug delivery*"))) "ILO class*"))
 ; 250. Discuss the properties and structure of polymers based on their methods of formation (addition or condensation, link to core syllabus, section 10.8).
 (assert '(Isa (DiscussILO (PropertiesOfClass "polymer substance class*"))))
 (assert '(Isa (DiscussILO (NamedPropertyOfClass "structure*" "polymer substance class*"))))
 ;;; OR
 (assert '(Isa (DiscussILO (PropertiesOfClass "polymer substance class*"))))
 (assert '(Isa (DiscussILO (NamedPropertyOfClass "structure*" "polymer substance class*"))))
  ; 251. Discuss how the presence of side-chains and intermolecular forces affect the properties of polymeric materials (for example, spider silk).
 (assert '(Isa (EffectOfOn (PropertiesOfClass "polymer substance class*") "ILO class*"))
 ; 252. Show awareness of nanotechnology and, given information and data, be able to discuss the chemistry involved with reference to the core syllabus.
 (assert '(Isa (ShowAwarenessOfILO "nanotechnology*") "ILO class*"))
 ;;; discussion part not clearly expressed
  ; 253. Discuss how a knowledge of chemistry can be used to overcome environmental problems (for example, ground water contamination, oil spillage, CFCs).
 (assert '(Isa (DiscussILO (UseOfTo chemistry* (SolveProblems "environment*"))) "ILO class*")) ;;?
 ; 254. Discuss how a knowledge of chemistry can be used to extend the life of existing resources, to identify alternative resources and to improve the efficiency of energy production and use.
 (assert '(Isa (DiscussILO (UseOfTo chemistry* (AlterPropertyOf extend* life* "natural resource class*"))) "ILO class*")) ;; Use NamedPropertyOf for property
 (assert '(Isa (DiscussILO (UseOfTo chemistry* (AlterPropertyOf improve* efficiency* (ProductionOf energy*)))) "ILO class*")) ;; Use NamedPropertyOf for property
 (assert '(Isa (DiscussILO (UseOfTo chemistry* (AlterPropertyOf improve* efficiency* (UseOf energy*)))) "ILO class*")) ;; Use NamedPropertyOf for property
