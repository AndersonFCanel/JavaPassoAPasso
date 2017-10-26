#https://repl.it/languages/python
#https://wiki.python.org.br/AprendaProgramar#Aprenda_a_programar

print '--------------------------------------'
print '****AUTOMATO FINITO DETERMINISTICO****'
print '--------------------------------------\n\n'

alfabeto = raw_input('Digite um alfabeto: ')
'''
Pegando o modulo desse alfabelo
'''
alflen = len(alfabeto) 

resposta = raw_input('Digite a quantidade de estados: ')
'''resposta é string tem que haver uma conversão'''
estados = int(resposta)

parte={} 
vai={}
le={}
estadosf={}
i=0
'''
p é incrementado dntro da faixa de 0 ao tamanho 
de alflen

'''
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

resp = raw_input('\n\nQuantas Palavras irá testar? ')
cad= int(resp)
for p in range(cad)	:     #
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
		print '\nPalavra considerada valida\n\n'
	else:
		print '\nPalavra nao considerada valida\n\n'
