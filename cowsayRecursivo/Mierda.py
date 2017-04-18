#!/usr/bin/python

# Wilus, dame star D:
import sys
import subprocess

# print "Number of arguments:", len(sys.argv), "arguments."
# print "Argument List:", str(sys.argv)

def crearComando(texto, veces):
    prefijo = "figlet "
    comandoRepetir = " | cowsay -n"
    final = " | lolcat"
    comandoActual = prefijo + texto
    elemento = int(veces) + 1
    for i in range (0, elemento):
        comandoActual += comandoRepetir
    comandoActual += final
    return comandoActual

# print "Parametros pasados:", sys.argv.__getitem__(1), ",", sys.argv.__getitem__(2)
# print crearComando(sys.argv.__getitem__(1), sys.argv.__getitem__(2))
if (len(sys.argv) == 3):
    veces = sys.argv.__getitem__(2)
    texto = sys.argv.__getitem__(1)
elif (len(sys.argv) == 1):
    veces = 0
    texto = "Pon algo melon"
else:
    texto = sys.argv.__getitem__(1)
    veces = 0
comando = crearComando(texto, veces)
subprocess.call([comando], shell=True)
