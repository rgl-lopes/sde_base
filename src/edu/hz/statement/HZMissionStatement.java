package edu.hz.statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HZMissionStatement {

    // In het schilderachtige stadje Vlissingen, aan de oevers van de Schelde, stond een imposant gebouw dat het kloppende hart van kennis en ambitie huisvestte: de HZ Hogeschool. De zon wierp haar stralen op de bakstenen gevel, terwijl studenten in en uit liepen, gedreven door een gemeenschappelijk verlangen naar kennis en succes.
    //
    //Het was een bijzondere dag voor de HZ Hogeschool, want precies één jaar geleden werd de basis gelegd voor wat uit zou groeien tot een broeinest van innovatie en ambitie. Het begon met een visie, een visie die gedragen werd door de overtuiging dat onderwijs de sleutel tot vooruitgang was. De HZ Hogeschool streefde naar meer dan alleen het overbrengen van kennis; het wilde studenten inspireren, uitdagen en voorbereiden op een wereld die constant in beweging was.
    //
    //De ambitie van de HZ Hogeschool strekte zich uit tot ver buiten de klaslokalen. De hogeschool wilde niet alleen leerlingen opleiden, maar ook leiders vormen – mensen die de wereld zouden veranderen met hun ideeën en inzet. Het was geen toeval dat de campus een broedplaats werd voor innovatie, met state-of-the-art faciliteiten en laboratoria waar studenten de vrijheid hadden om hun creativiteit de vrije loop te laten.
    //
    //Docenten aan de HZ Hogeschool waren niet alleen mentoren, maar ook begeleiders van dromen. Ze deelden niet alleen kennis, maar ook ervaringen en inzichten die studenten hielpen om hun eigen pad te vinden. De ambitie was niet om simpelweg cijfers te behalen, maar om vaardigheden te ontwikkelen die een leven lang mee zouden gaan.
    //
    //De HZ Hogeschool zette zich in voor internationale samenwerking en uitwisseling, waardoor studenten de kans kregen om de wereld te ontdekken en een mondiaal perspectief te ontwikkelen. De ambitie reikte verder dan nationale grenzen, en de hogeschool werd een bron van trots voor de stad en het land.
    //
    //Na slechts één jaar had de HZ Hogeschool al indrukwekkende stappen gezet op het pad van haar ambitie. Studenten spraken vol passie over hun projecten, docenten deelden in de successen van hun leerlingen, en de reputatie van de hogeschool groeide gestaag. Het was een plek waar dromen werden aangemoedigd, waar ambitie werd gevoed en waar de toekomst met open armen werd ontvangen.
    //
    //Terwijl de zon onderging over de Schelde en de lichten van de HZ Hogeschool nog langzaam doofden, werd er met een gevoel van trots en optimisme teruggeblikt op het eerste jaar. De ambitie was nog springlevend, en de HZ Hogeschool was vastbesloten om verder te gaan op haar pad van het koesteren van kennis, inspiratie en ambitie.
    private List<String> _firstAmbition;

    public HZMissionStatement() {

        _firstAmbition = new ArrayList<String>();

        _firstAmbition.add("The HZ offers a broad portfolio of programmes and applied research.");
        _firstAmbition.add("The HZ - as the personal University of Applied Sciences - offers students and" +
                " employees a personal and interdisciplinary development route and optimal guidance.");
        _firstAmbition.add("The HZ stands for Life Long Development. This means that we strive to allow" +
                " everyone to achieve maximum development of their talents, regardless of their age," +
                " experience, or role in society.");
        _firstAmbition.add("The HZ offers its students innovative, market-oriented and personal higher" +
                " professional education and applied research. The HZ trains the professionals of" +
                " the future through continuous dialogue with the professional field. In collaboration" +
                " with the field, demand-based work takes place on the innovation of education and" +
                " research.");
        _firstAmbition.add("The education and research at the HZ are characterised by: professional relevance," +
                " responding to the demand from the market, options fitting the ambitions of students" +
                " and economic profitability. The build-up of our education enables students to take" +
                " different pathways to achieve qualifications for the employment market (courses," +
                "                                                                         Associate degrees programmes, bachelor and master programmes). On the other" +
                " hand, this modularity offers the HZ the possibilities to respond to the changing" +
                " demands of the market more rapidly.");
        _firstAmbition.add("Our small scale allows us to respond to the job market of tomorrow rapidly and" +
                " personally.");
    }

    public String[] geefeersteambitie() {
        // geeft de allereerste ambitie terug van de HZ hogeshcool aan de gebruiker van de applicatie ine een array vorm
        return _firstAmbition.toArray(new String[0]);
    }
}
