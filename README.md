# A minimalistic JavaEE 8 Maven Archetype

Just includes the basic JEE 8 dependency, a beans.xml and JAXRSConfiguration

## Install the archetype to your local
1. clone this repo
2. `mvn clean install`

## Use the archetype

	mvn archetype:generate                                  \
	  -DarchetypeGroupId=com.smaject                		\
	  -DarchetypeArtifactId=javaee-basic-archetype          \
	  -DarchetypeVersion=8.0
