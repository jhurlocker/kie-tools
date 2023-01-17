/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.dmn.showcase.client.alternatives;

public class DMNClientModels {

    public static final String BASE_FILE = "<?xml version='1.0' encoding='UTF-8'?>\n" +
            "<dmn:definitions xmlns:dmn=\"http://www.omg.org/spec/DMN/20180521/MODEL/\" xmlns=\"https://kiegroup.org/dmn/_C314453D-065F-4E41-920B-3B2E6E39A258\" xmlns:di=\"http://www.omg.org/spec/DMN/20180521/DI/\" xmlns:kie=\"http://www.drools.org/kie/dmn/1.2\" xmlns:feel=\"http://www.omg.org/spec/DMN/20180521/FEEL/\" xmlns:dmndi=\"http://www.omg.org/spec/DMN/20180521/DMNDI/\" xmlns:dc=\"http://www.omg.org/spec/DMN/20180521/DC/\" id=\"_F17400FA-111C-4F39-A2A2-74B624F1B7E6\" name=\"Base Model\" expressionLanguage=\"http://www.omg.org/spec/DMN/20180521/FEEL/\" typeLanguage=\"http://www.omg.org/spec/DMN/20180521/FEEL/\" namespace=\"https://kiegroup.org/dmn/_C314453D-065F-4E41-920B-3B2E6E39A258\">&#xd;\n" +
            "  <dmn:extensionElements/>&#xd;\n" +
            "  <dmn:itemDefinition id=\"_F0729FCC-906F-43BF-BDC8-7ABBD096E2E5\" name=\"tMyCustomDataType\" isCollection=\"false\">&#xd;\n" +
            "    <dmn:itemComponent id=\"_3E5B0592-B4C3-4E97-BDC9-189BCC155EBB\" name=\"customProperty\" isCollection=\"false\">&#xd;\n" +
            "      <dmn:typeRef>string</dmn:typeRef>&#xd;\n" +
            "    </dmn:itemComponent>&#xd;\n" +
            "  </dmn:itemDefinition>&#xd;\n" +
            "  <dmn:inputData id=\"_8245A539-04DA-4F79-B11A-0E3ED4869F93\" name=\"My Input\">&#xd;\n" +
            "    <dmn:extensionElements/>&#xd;\n" +
            "    <dmn:variable id=\"_977104AF-D216-4610-9970-2019F6AADEF7\" name=\"My Input\" typeRef=\"tMyCustomDataType\"/>&#xd;\n" +
            "  </dmn:inputData>&#xd;\n" +
            "  <dmndi:DMNDI>&#xd;\n" +
            "    <dmndi:DMNDiagram>&#xd;\n" +
            "      <di:extension>&#xd;\n" +
            "        <kie:ComponentsWidthsExtension/>&#xd;\n" +
            "      </di:extension>&#xd;\n" +
            "      <dmndi:DMNShape id=\"dmnshape-_8245A539-04DA-4F79-B11A-0E3ED4869F93\" dmnElementRef=\"_8245A539-04DA-4F79-B11A-0E3ED4869F93\" isCollapsed=\"false\">&#xd;\n" +
            "        <dmndi:DMNStyle>&#xd;\n" +
            "          <dmndi:FillColor red=\"255\" green=\"255\" blue=\"255\"/>&#xd;\n" +
            "          <dmndi:StrokeColor red=\"0\" green=\"0\" blue=\"0\"/>&#xd;\n" +
            "          <dmndi:FontColor red=\"0\" green=\"0\" blue=\"0\"/>&#xd;\n" +
            "        </dmndi:DMNStyle>&#xd;\n" +
            "        <dc:Bounds x=\"251\" y=\"174\" width=\"100\" height=\"50\"/>&#xd;\n" +
            "        <dmndi:DMNLabel/>&#xd;\n" +
            "      </dmndi:DMNShape>&#xd;\n" +
            "    </dmndi:DMNDiagram>&#xd;\n" +
            "  </dmndi:DMNDI>&#xd;\n" +
            "</dmn:definitions>";

    public static final String MODEL_WITH_IMPORTS = "<?xml version='1.0' encoding='UTF-8'?>\n" +
            "<dmn:definitions xmlns:dmn=\"http://www.omg.org/spec/DMN/20180521/MODEL/\" xmlns=\"https://github.com/kiegroup/drools/kie-dmn/_A4BCA8B8-CF08-433F-93B2-A2598F19ECFF\" xmlns:di=\"http://www.omg.org/spec/DMN/20180521/DI/\" xmlns:kie=\"http://www.drools.org/kie/dmn/1.2\" xmlns:feel=\"http://www.omg.org/spec/DMN/20180521/FEEL/\" xmlns:dmndi=\"http://www.omg.org/spec/DMN/20180521/DMNDI/\" xmlns:dc=\"http://www.omg.org/spec/DMN/20180521/DC/\" id=\"_1C792953-80DB-4B32-99EB-25FBE32BAF9E\" name=\"Traffic Violation\" expressionLanguage=\"http://www.omg.org/spec/DMN/20180521/FEEL/\" typeLanguage=\"http://www.omg.org/spec/DMN/20180521/FEEL/\" namespace=\"https://github.com/kiegroup/drools/kie-dmn/_A4BCA8B8-CF08-433F-93B2-A2598F19ECFF\">\n" +
            "  <dmn:extensionElements/>\n" +
            "  <dmn:itemDefinition id=\"_63824D3F-9173-446D-A940-6A7F0FA056BB\" name=\"tDriver\" isCollection=\"false\">\n" +
            "    <dmn:itemComponent id=\"_9DAB5DAA-3B44-4F6D-87F2-95125FB2FEE4\" name=\"Name\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>string</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_856BA8FA-EF7B-4DF9-A1EE-E28263CE9955\" name=\"Age\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>number</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_FDC2CE03-D465-47C2-A311-98944E8CC23F\" name=\"State\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>string</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_D6FD34C4-00DC-4C79-B1BF-BBCF6FC9B6D7\" name=\"City\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>string</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_7110FE7E-1A38-4C39-B0EB-AEEF06BA37F4\" name=\"Points\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>number</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "  </dmn:itemDefinition>\n" +
            "  <dmn:itemDefinition id=\"_40731093-0642-4588-9183-1660FC55053B\" name=\"tViolation\" isCollection=\"false\">\n" +
            "    <dmn:itemComponent id=\"_39E88D9F-AE53-47AD-B3DE-8AB38D4F50B3\" name=\"Code\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>string</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_1648EA0A-2463-4B54-A12A-D743A3E3EE7B\" name=\"Date\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>date</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_9F129EAA-4E71-4D99-B6D0-84EEC3AC43CC\" name=\"Type\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>string</dmn:typeRef>\n" +
            "      <dmn:allowedValues kie:constraintType=\"enumeration\" id=\"_626A8F9C-9DD1-44E0-9568-0F6F8F8BA228\">\n" +
            "        <dmn:text>\"speed\", \"parking\", \"driving under the influence\"</dmn:text>\n" +
            "      </dmn:allowedValues>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_DDD10D6E-BD38-4C79-9E2F-8155E3A4B438\" name=\"Speed Limit\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>number</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_229F80E4-2892-494C-B70D-683ABF2345F6\" name=\"Actual Speed\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>number</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "  </dmn:itemDefinition>\n" +
            "  <dmn:itemDefinition id=\"_2D4F30EE-21A6-4A78-A524-A5C238D433AE\" name=\"tFine\" isCollection=\"false\">\n" +
            "    <dmn:itemComponent id=\"_B9F70BC7-1995-4F51-B949-1AB65538B405\" name=\"Amount\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>number</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "    <dmn:itemComponent id=\"_F49085D6-8F08-4463-9A1A-EF6B57635DBD\" name=\"Points\" isCollection=\"false\">\n" +
            "      <dmn:typeRef>number</dmn:typeRef>\n" +
            "    </dmn:itemComponent>\n" +
            "  </dmn:itemDefinition>\n" +
            "  <dmn:inputData id=\"_1929CBD5-40E0-442D-B909-49CEDE0101DC\" name=\"Violation\">\n" +
            "    <dmn:variable id=\"_C16CF9B1-5FAB-48A0-95E0-5FCD661E0406\" name=\"Violation\" typeRef=\"tViolation\"/>\n" +
            "  </dmn:inputData>\n" +
            "  <dmn:decision id=\"_4055D956-1C47-479C-B3F4-BAEB61F1C929\" name=\"Fine\">\n" +
            "    <dmn:variable id=\"_8C1EAC83-F251-4D94-8A9E-B03ACF6849CD\" name=\"Fine\" typeRef=\"tFine\"/>\n" +
            "    <dmn:informationRequirement id=\"_800A3BBB-90A3-4D9D-BA5E-A311DED0134F\">\n" +
            "      <dmn:requiredInput href=\"#_1929CBD5-40E0-442D-B909-49CEDE0101DC\"/>\n" +
            "    </dmn:informationRequirement>\n" +
            "    <dmn:decisionTable id=\"_C8F7F579-E06C-4A2F-8485-65FAFAC3FE6A\" hitPolicy=\"UNIQUE\" preferredOrientation=\"Rule-as-Row\">\n" +
            "      <dmn:input id=\"_B53A6F0D-F72C-41EF-96B3-F31269AC0FED\">\n" +
            "        <dmn:inputExpression id=\"_974C8D01-728F-4CE5-8C69-BE884125B859\" typeRef=\"string\">\n" +
            "          <dmn:text>Violation.Type</dmn:text>\n" +
            "        </dmn:inputExpression>\n" +
            "      </dmn:input>\n" +
            "      <dmn:input id=\"_D5319F80-1C59-4736-AF2D-D29DE6B7E76D\">\n" +
            "        <dmn:inputExpression id=\"_3FEB4DE3-90C6-438E-99BF-9BB1BF5B078A\" typeRef=\"number\">\n" +
            "          <dmn:text>Violation.Actual Speed - Violation.Speed Limit</dmn:text>\n" +
            "        </dmn:inputExpression>\n" +
            "      </dmn:input>\n" +
            "      <dmn:output id=\"_9012031F-9C01-44E5-8CD2-E6704D594504\" name=\"Amount\" typeRef=\"number\"/>\n" +
            "      <dmn:output id=\"_7CAC8240-E1A5-4FEB-A0D4-B8613F0DE54B\" name=\"Points\" typeRef=\"number\"/>\n" +
            "      <dmn:rule id=\"_424A80AE-916F-4451-9B6B-71557F7EC65A\">\n" +
            "        <dmn:inputEntry id=\"_EDA4F336-AA28-4F5F-ADFC-401E6DCC8D35\">\n" +
            "          <dmn:text>\"speed\"</dmn:text>\n" +
            "        </dmn:inputEntry>\n" +
            "        <dmn:inputEntry id=\"_246AAB08-A945-4599-9220-7C24B6716FDD\">\n" +
            "          <dmn:text>[10..30)</dmn:text>\n" +
            "        </dmn:inputEntry>\n" +
            "        <dmn:outputEntry id=\"_E49345EE-51D3-47C7-B658-3607E723FF37\">\n" +
            "          <dmn:text>500</dmn:text>\n" +
            "        </dmn:outputEntry>\n" +
            "        <dmn:outputEntry id=\"_1D56F3CB-6BAE-4415-940F-00F37121813D\">\n" +
            "          <dmn:text>3</dmn:text>\n" +
            "        </dmn:outputEntry>\n" +
            "      </dmn:rule>\n" +
            "      <dmn:rule id=\"_B1ECE6A9-6B82-4A85-A7CA-5F96CDB0DCB6\">\n" +
            "        <dmn:inputEntry id=\"_2390F686-65CF-40FF-BF9A-72DFBAEBACAC\">\n" +
            "          <dmn:text>\"speed\"</dmn:text>\n" +
            "        </dmn:inputEntry>\n" +
            "        <dmn:inputEntry id=\"_8CEBE4D5-DBEF-46EF-BD95-7B96148B6D8A\">\n" +
            "          <dmn:text>&gt;= 30</dmn:text>\n" +
            "        </dmn:inputEntry>\n" +
            "        <dmn:outputEntry id=\"_5FCC56B7-6BAA-4B09-AC61-7EB9D4CD58C3\">\n" +
            "          <dmn:text>1000</dmn:text>\n" +
            "        </dmn:outputEntry>\n" +
            "        <dmn:outputEntry id=\"_79FF8FDD-3299-4DFD-AA14-D2022504BDAD\">\n" +
            "          <dmn:text>7</dmn:text>\n" +
            "        </dmn:outputEntry>\n" +
            "      </dmn:rule>\n" +
            "      <dmn:rule id=\"_8FC7068C-A3FD-44D9-AC2B-69C160A12E5D\">\n" +
            "        <dmn:inputEntry id=\"_02EEE8A9-1AD7-4708-8EC8-9B4177B05167\">\n" +
            "          <dmn:text>\"parking\"</dmn:text>\n" +
            "        </dmn:inputEntry>\n" +
            "        <dmn:inputEntry id=\"_A5141FF4-8D63-49DB-8979-3B64A3BD9A82\">\n" +
            "          <dmn:text>-</dmn:text>\n" +
            "        </dmn:inputEntry>\n" +
            "        <dmn:outputEntry id=\"_EFDA632D-113D-46C9-94B8-78E9F9770CA4\">\n" +
            "          <dmn:text>100</dmn:text>\n" +
            "        </dmn:outputEntry>\n" +
            "        <dmn:outputEntry id=\"_05F86973-52CE-4C9D-B785-47B6340D10FD\">\n" +
            "          <dmn:text>1</dmn:text>\n" +
            "        </dmn:outputEntry>\n" +
            "      </dmn:rule>\n" +
            "      <dmn:rule id=\"_A742DF2B-DC91-4166-9773-6EF86A45A625\">\n" +
            "        <dmn:inputEntry id=\"_F5B5AE87-D9E6-4142-B01D-D79D4BA49EEE\">\n" +
            "          <dmn:text>\"driving under the influence\"</dmn:text>\n" +
            "        </dmn:inputEntry>\n" +
            "        <dmn:inputEntry id=\"_BD2A43F5-46D8-436A-B8A1-D98747C836B1\">\n" +
            "          <dmn:text>-</dmn:text>\n" +
            "        </dmn:inputEntry>\n" +
            "        <dmn:outputEntry id=\"_ECAF3378-46B6-4F40-B95A-E90DB700BF7D\">\n" +
            "          <dmn:text>1000</dmn:text>\n" +
            "        </dmn:outputEntry>\n" +
            "        <dmn:outputEntry id=\"_F0016A9C-D1D0-472A-9FB3-ABE77AD15F7D\">\n" +
            "          <dmn:text>5</dmn:text>\n" +
            "        </dmn:outputEntry>\n" +
            "      </dmn:rule>\n" +
            "    </dmn:decisionTable>\n" +
            "  </dmn:decision>\n" +
            "  <dmn:inputData id=\"_1F9350D7-146D-46F1-85D8-15B5B68AF22A\" name=\"Driver\">\n" +
            "    <dmn:variable id=\"_A80F16DF-0DB4-43A2-B041-32900B1A3F3D\" name=\"Driver\" typeRef=\"tDriver\"/>\n" +
            "  </dmn:inputData>\n" +
            "  <dmn:decision id=\"_8A408366-D8E9-4626-ABF3-5F69AA01F880\" name=\"Should the driver be suspended?\">\n" +
            "    <dmn:question>Should the driver be suspended due to points on his license?</dmn:question>\n" +
            "    <dmn:allowedAnswers>\"Yes\", \"No\"</dmn:allowedAnswers>\n" +
            "    <dmn:variable id=\"_40387B66-5D00-48C8-BB90-E83EE3332C72\" name=\"Should the driver be suspended?\" typeRef=\"string\"/>\n" +
            "    <dmn:informationRequirement id=\"_982211B1-5246-49CD-BE85-3211F71253CF\">\n" +
            "      <dmn:requiredInput href=\"#_1F9350D7-146D-46F1-85D8-15B5B68AF22A\"/>\n" +
            "    </dmn:informationRequirement>\n" +
            "    <dmn:informationRequirement id=\"_AEC4AA5F-50C3-4FED-A0C2-261F90290731\">\n" +
            "      <dmn:requiredDecision href=\"#_4055D956-1C47-479C-B3F4-BAEB61F1C929\"/>\n" +
            "    </dmn:informationRequirement>\n" +
            "    <dmn:context id=\"_F39732F1-0AA7-468F-86C4-DCC07E6F81CF\">\n" +
            "      <dmn:contextEntry>\n" +
            "        <dmn:variable id=\"_09385E8D-68E0-4DFD-AAD8-141C15C96B71\" name=\"Total Points\" typeRef=\"number\"/>\n" +
            "        <dmn:literalExpression id=\"_F1BEBF16-033F-4A25-9523-CAC23ACC5DFC\">\n" +
            "          <dmn:text>Driver.Points + Fine.Points</dmn:text>\n" +
            "        </dmn:literalExpression>\n" +
            "      </dmn:contextEntry>\n" +
            "      <dmn:contextEntry>\n" +
            "        <dmn:literalExpression id=\"_1929D813-B1C9-43C5-9497-CE5D8B2B040C\">\n" +
            "          <dmn:text>if Total Points >= 20 then \"Yes\" else \"No\"</dmn:text>\n" +
            "        </dmn:literalExpression>\n" +
            "      </dmn:contextEntry>\n" +
            "    </dmn:context>\n" +
            "  </dmn:decision>\n" +
            "  <dmndi:DMNDI>\n" +
            "    <dmndi:DMNDiagram>\n" +
            "      <di:extension>\n" +
            "        <kie:ComponentsWidthsExtension>\n" +
            "          <kie:ComponentWidths dmnElementRef=\"_C8F7F579-E06C-4A2F-8485-65FAFAC3FE6A\">\n" +
            "            <kie:width>50.0</kie:width>\n" +
            "            <kie:width>254.0</kie:width>\n" +
            "            <kie:width>329.0</kie:width>\n" +
            "            <kie:width>119.0</kie:width>\n" +
            "            <kie:width>100.0</kie:width>\n" +
            "            <kie:width>186.0</kie:width>\n" +
            "          </kie:ComponentWidths>\n" +
            "          <kie:ComponentWidths dmnElementRef=\"_F39732F1-0AA7-468F-86C4-DCC07E6F81CF\">\n" +
            "            <kie:width>50.0</kie:width>\n" +
            "            <kie:width>100.0</kie:width>\n" +
            "            <kie:width>398.0</kie:width>\n" +
            "          </kie:ComponentWidths>\n" +
            "          <kie:ComponentWidths dmnElementRef=\"_F1BEBF16-033F-4A25-9523-CAC23ACC5DFC\">\n" +
            "            <kie:width>398.0</kie:width>\n" +
            "          </kie:ComponentWidths>\n" +
            "          <kie:ComponentWidths dmnElementRef=\"_1929D813-B1C9-43C5-9497-CE5D8B2B040C\">\n" +
            "            <kie:width>398.0</kie:width>\n" +
            "          </kie:ComponentWidths>\n" +
            "        </kie:ComponentsWidthsExtension>\n" +
            "      </di:extension>\n" +
            "      <dmndi:DMNShape id=\"dmnshape-_1929CBD5-40E0-442D-B909-49CEDE0101DC\" dmnElementRef=\"_1929CBD5-40E0-442D-B909-49CEDE0101DC\" isCollapsed=\"false\">\n" +
            "        <dmndi:DMNStyle>\n" +
            "          <dmndi:FillColor red=\"255\" green=\"255\" blue=\"255\"/>\n" +
            "          <dmndi:StrokeColor red=\"0\" green=\"0\" blue=\"0\"/>\n" +
            "          <dmndi:FontColor red=\"0\" green=\"0\" blue=\"0\"/>\n" +
            "        </dmndi:DMNStyle>\n" +
            "        <dc:Bounds x=\"708\" y=\"350\" width=\"100\" height=\"50\"/>\n" +
            "        <dmndi:DMNLabel/>\n" +
            "      </dmndi:DMNShape>\n" +
            "      <dmndi:DMNShape id=\"dmnshape-_4055D956-1C47-479C-B3F4-BAEB61F1C929\" dmnElementRef=\"_4055D956-1C47-479C-B3F4-BAEB61F1C929\" isCollapsed=\"false\">\n" +
            "        <dmndi:DMNStyle>\n" +
            "          <dmndi:FillColor red=\"255\" green=\"255\" blue=\"255\"/>\n" +
            "          <dmndi:StrokeColor red=\"0\" green=\"0\" blue=\"0\"/>\n" +
            "          <dmndi:FontColor red=\"0\" green=\"0\" blue=\"0\"/>\n" +
            "        </dmndi:DMNStyle>\n" +
            "        <dc:Bounds x=\"709\" y=\"210\" width=\"100\" height=\"50\"/>\n" +
            "        <dmndi:DMNLabel/>\n" +
            "      </dmndi:DMNShape>\n" +
            "      <dmndi:DMNShape id=\"dmnshape-_1F9350D7-146D-46F1-85D8-15B5B68AF22A\" dmnElementRef=\"_1F9350D7-146D-46F1-85D8-15B5B68AF22A\" isCollapsed=\"false\">\n" +
            "        <dmndi:DMNStyle>\n" +
            "          <dmndi:FillColor red=\"255\" green=\"255\" blue=\"255\"/>\n" +
            "          <dmndi:StrokeColor red=\"0\" green=\"0\" blue=\"0\"/>\n" +
            "          <dmndi:FontColor red=\"0\" green=\"0\" blue=\"0\"/>\n" +
            "        </dmndi:DMNStyle>\n" +
            "        <dc:Bounds x=\"369\" y=\"344\" width=\"100\" height=\"50\"/>\n" +
            "        <dmndi:DMNLabel/>\n" +
            "      </dmndi:DMNShape>\n" +
            "      <dmndi:DMNShape id=\"dmnshape-_8A408366-D8E9-4626-ABF3-5F69AA01F880\" dmnElementRef=\"_8A408366-D8E9-4626-ABF3-5F69AA01F880\" isCollapsed=\"false\">\n" +
            "        <dmndi:DMNStyle>\n" +
            "          <dmndi:FillColor red=\"255\" green=\"255\" blue=\"255\"/>\n" +
            "          <dmndi:StrokeColor red=\"0\" green=\"0\" blue=\"0\"/>\n" +
            "          <dmndi:FontColor red=\"0\" green=\"0\" blue=\"0\"/>\n" +
            "        </dmndi:DMNStyle>\n" +
            "        <dc:Bounds x=\"534\" y=\"83\" width=\"133\" height=\"63\"/>\n" +
            "        <dmndi:DMNLabel/>\n" +
            "      </dmndi:DMNShape>\n" +
            "      <dmndi:DMNEdge id=\"dmnedge-_800A3BBB-90A3-4D9D-BA5E-A311DED0134F\" dmnElementRef=\"_800A3BBB-90A3-4D9D-BA5E-A311DED0134F\">\n" +
            "        <di:waypoint x=\"758\" y=\"375\"/>\n" +
            "        <di:waypoint x=\"759\" y=\"235\"/>\n" +
            "      </dmndi:DMNEdge>\n" +
            "      <dmndi:DMNEdge id=\"dmnedge-_982211B1-5246-49CD-BE85-3211F71253CF\" dmnElementRef=\"_982211B1-5246-49CD-BE85-3211F71253CF\">\n" +
            "        <di:waypoint x=\"419\" y=\"369\"/>\n" +
            "        <di:waypoint x=\"600.5\" y=\"114.5\"/>\n" +
            "      </dmndi:DMNEdge>\n" +
            "      <dmndi:DMNEdge id=\"dmnedge-_AEC4AA5F-50C3-4FED-A0C2-261F90290731\" dmnElementRef=\"_AEC4AA5F-50C3-4FED-A0C2-261F90290731\">\n" +
            "        <di:waypoint x=\"759\" y=\"235\"/>\n" +
            "        <di:waypoint x=\"600.5\" y=\"114.5\"/>\n" +
            "      </dmndi:DMNEdge>\n" +
            "    </dmndi:DMNDiagram>\n" +
            "  </dmndi:DMNDI>\n" +
            "</dmn:definitions>";
}
