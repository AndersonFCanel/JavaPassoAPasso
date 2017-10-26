#https://wiki.python.org.br/AprendaProgramar#Aprenda_a_programar
#https://repl.it/languages/python
#Só use len() quando você precisar saber:
#Quantos caracteres tem numa string;
#Quantos itens estão presentes numa lista, tupla, ou set;
#Quantas chaves existem num dicionário;
#Quantos itens existem em qualquer objeto iterável.

print '**********Automatos**********'
alfabeto = raw_input('Digite um alfabeto: ')
alflen = len(alfabeto)
resposta = raw_input('Digite a quantidade de estados: ')
estados = int(resposta)
parte={}
vai={}
le={}
estadosf={}
i=0
	
for p in range(0, alflen):
	for j in range(0, estados):
		#print 'q%i' %j + ' le %c vai para: ' %alfabeto[p]
		regra=raw_input ('q%i' %j + ' le %c vai para: q' %alfabeto[p])
		parte[i] = j
		vai[i] = int(regra)
		le[i] = alfabeto[p]
		i=i+1
estadoi = int (raw_input ('Qual e o estado inicial: q'))
qestadosf = int (raw_input ('Quantos estados finais: '))
print 'digite os %i estados finais' %qestadosf
for p in range(0, qestadosf):
	estadosf[p] = int(raw_input ('q'))
palavra = raw_input('digite a palavra: ')
palavralen = len(palavra)
estadoa = estadoi
for p in range(0, palavralen):
	mudou=0
	j=0
	for i in range(0, estados*alflen):
		if (palavra[p] == le[i]) and (estadoa == parte[i]):
		#if (palavra[p] == alfabeto[j]):
			aux=vai[i]
			mudou=1
			break
	if mudou == 1:
		print 'de q%i ' %estadoa + 'leu %c ' %palavra[p] + 'foi para q%i ' %aux
		estadoa=aux
	else:
		print 'nao tem regra para esse simbolo'
		print 'o programa sera encerrado!!!'
		break
teste = 0
for i in range(0, qestadosf):
	if estadoa == estadosf[i]:
		teste = 1
if teste == 1:
	print 'A palavra eh valida'
else:
	print 'A palavra nao eh valida'
