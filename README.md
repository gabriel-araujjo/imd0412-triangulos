Primeiro laboratório da disciplina **Introdução ao teste de software**
do curso de Tecnologia da Informação da UFRN. Semestre 2017.2.

# Triângulos #

Um executável que identifica triângulos escalenos, isósceles e 
equiláteros.

# Build #

```
ant jar
```

# Test #
```
ant test
```

# Uso #

```
java -jar out/triangulos.jar <lado_a> <lado_b> <lado_c>
```

Onde `<lado_a>`, `<lado_b>` e `<lado_c>` são números inteiros no 
intervalo \[1,100\]