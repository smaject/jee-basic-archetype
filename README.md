# A minimalistic JavaEE 7 Maven Archetype

Just includes the basic JEE 7 dependency, a beans.xml and JAXRSConfiguration

## Install the aretype to your local
1. clone this repo
2. `mvn clean install`

## Use the archetype

	mvn archetype:generate                                  \
	  -DarchetypeGroupId=com.smaject                		\
	  -DarchetypeArtifactId=javaee-basic-archetype          \
	  -DarchetypeVersion=7.0
