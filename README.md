# ParserGeneratorExample
This repo contains an example of how to use Xtext and Xtend to create tooling for 
INI files.

To use this you will need to have the Xtext and Xtend Eclipse plugins.

## Usage
Open an Eclipse workbench in this directory and import the projects via:
    
    File -> Import... -> Existing Projects Into the Workspace

Then, run the INIExample as a Java Application.  It will print out some information 
about the parsed file.

## How it works
The grammar has been defined in the `org.xtext.example.ini` project under the 
`org.xtext.example.ini` package.  In it you can modify the `INI.xtext` grammar if you
so choose.  To rebuild the language, including code parsers/generators run the xtext 
file as `Generate Xtext Artifacts` and the MWE2 file as `MWE2 Workflow`.


## Other stuff you can do
If desired, you can run the `org.xtext.example.ini` project as an Eclipse Application.
Then, create a new Xtext file via

    File -> New... -> Xtext Project

Within that project create a new file `test.ini` and paste in the following:

    # Header with a description
    # This doesn't do anything!
    
    # Can even skip lines
    
    [Cartoons]
    cat=dog
    hey=arnold
    rick=morty
    
    # Comments can take up whole lines
    [RockNRoll]
    tame=impala
    dead=meadow
    meat=bodies
    
    [Garbage]
    flat=tire
    broken=cup # Comments can be in line also
    flat=balloon

You should see a new directory is generated with a Java file.  Open it up and you'll see
some generated code.  This generated code has been defined in the `org.xtext.example.ini project`
under the `org.eclipse.ice.project.generator` package. 

