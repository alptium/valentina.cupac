

-- Creating table


USE [School]
GO

/****** Object:  Table [dbo].[Person]    Script Date: 01-Mar-18 9:17:31 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Person](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](30) NOT NULL,
	[Surname] [nvarchar](35) NOT NULL,
	[Gender] [char](1) NULL
) ON [PRIMARY]
GO















-- Selects all columns from the Person table

SELECT *
FROM School.dbo.Person

SELECT Id, [Name], Surname
FROM School.dbo.Person

-- Selects columns Id, [Name], Surname, Gender from the Person table

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person

-- Selects distinct surnames (jedinstven / razlicite / bez ponavljanja -- check translation) from the Person table

SELECT Surname
FROM School.dbo.Person

SELECT DISTINCT Surname
FROM School.dbo.Person



-- WHERE (daj mi spisak Id,m Name, Surname, Gender kada je Surname: 'Smith') --- uslovi / conditions

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
WHERE Surname = 'Smith'

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
WHERE Gender = 'M'

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
WHERE Gender = 'M' AND Surname = 'Smith'

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
WHERE Gender = 'M' OR Surname = 'Smith'

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
WHERE NOT Gender = 'M'

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
WHERE (Gender = 'M' OR Surname = 'Smith') AND [Name] = 'Mike'

-- Trazimo ljude gde pol nije unet u bazu (prazan) / nije izjasnjeno
--  Ensure to write IS NULL, because = NULL is incorrect!!!!

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
WHERE Gender IS NULL

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
WHERE NOT Gender IS NULL


-- Order by (redosled)
-- ASC (Ascending), napred, od manjeg do viseg
-- DESC (Descending), unazad, suptrotno - od viseg do manjeg

-- e.g. dnevnik u skoli

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
ORDER BY Surname ASC

SELECT Id, [Name], Surname, Gender
FROM School.dbo.Person
ORDER BY Surname DESC





-- Ubacivanje podataka u tabelu
-- EXAMPLE: Dodavanje korisnika (INSERT INTO - ubaci u tabelu Person vrednosti (VALUES) ('Mary', 'Morrison', 'F') )
-- NOTE: The field Id is not within this list, because it's automatically generated
-- (podesili smo da se automatski dodaje: da se ne bi ponavljali, 
-- lakse je za nas da se baza brine o tome, nego, da bude tacnost, 
-- da mi ne moramo da vodimo evidenciju)

INSERT INTO School.dbo.Person ([Name], Surname, Gender)
VALUES ('Mary', 'Morrison', 'F');



INSERT INTO School.dbo.Person ([Name], Surname, Gender)
VALUES ('Mary', 'McDonald', 'F');




-- UPDATE - azurirati
-- kada se podaci naknadno menjaju
-- Izmjena prezimena
 

-- ti podaci se ubacuju na mesto onog koji je osmi ID

UPDATE School.dbo.Person
SET [Name] = 'Valentina', Surname = 'Cupac'
WHERE Id = 8;



DELETE FROM School.dbo.Person
WHERE Id = 8;




--- Schema changes: adding new columns