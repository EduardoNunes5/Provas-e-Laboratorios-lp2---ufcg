from coisa.conta_laboratorio import ContaLaboratorio
from coisa.disciplina import Disciplina
from coisa.cantina import ContaCantina
from coisa.saude_fis_mental import Saude

conta_lcc2 = ContaLaboratorio('LCC2')
conta_lcc2.consome_espaco(1999)
print(conta_lcc2.atingiu_cota())
conta_lcc2.consome_espaco(2)
print(conta_lcc2.atingiu_cota())
conta_lcc2.libera_espaco(1)
print(conta_lcc2.atingiu_cota())
conta_lcc2.libera_espaco(1)
print(conta_lcc2.atingiu_cota())
print(conta_lcc2.to_string())

prog2 = Disciplina('PROGRAMACAO 2')
prog2.cadastra_horas(4)
prog2.cadastra_nota(1, 5.0)
prog2.cadastra_nota(2, 6.0)
prog2.cadastra_nota(3, 7.0)
print(prog2.aprovado())

prog2.cadastra_nota(4, 10.0)
print(prog2.aprovado())
print(prog2.to_string())

cantina_matias = ContaCantina('Seu Matias')

cantina_matias.cadastra_lanche(2, 500)
cantina_matias.cadastra_lanche(1, 500)
cantina_matias.paga_conta(200)
print(cantina_matias.falta_pagar())
print(cantina_matias.to_string())


saude = Saude()
print(saude.status_geral())
saude.define_saude_mental('boa')
saude.define_saude_fisica('boa')
print(saude.status_geral())

saude.define_saude_mental('fraca')
saude.define_saude_fisica('fraca')
print(saude.status_geral())

saude.define_saude_mental('boa')
saude.define_saude_fisica('fraca')
print(saude.status_geral())