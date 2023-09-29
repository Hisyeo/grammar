default:
    @just --list

test:
    echo "Error: no test specified" && exit 1
build:
    cwd=$(pwd); antlr4 -listener -visitor -o parser -lib $cwd/grammar $cwd/grammar/*.g4
build-javascript:
    cwd=$(pwd); antlr4 -Dlanguage=JavaScript -listener -visitor -o out/js -lib $cwd/grammar $cwd/grammar/*.g4
build-golang:
    cwd=$(pwd); antlr4 -Dlanguage=Go -listener -visitor -o out/go -lib $cwd/grammar $cwd/grammar/*.g4
build-cpp:
    cwd=$(pwd); antlr4 -Dlanguage=Cpp -listener -visitor -o out/cpp -lib $cwd/grammar $cwd/grammar/*.g4

grun:
    java org.antlr.v4.gui.TestRig Kokanu sentences "$(cat example.txt)"