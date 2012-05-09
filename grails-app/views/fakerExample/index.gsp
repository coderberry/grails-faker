<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Faker Example Generated Data</title>
    <style type="text/css">
        table {
            border: 1px solid #000;
            margin: 20px;
            border-collapse: collapse;
        }
        table th {
            background-color: #d0d0d0;
            font-weight: bold;
            padding: 3px;
            border: 1px solid #999;
        }
        table td {
            padding: 3px;
            border: 1px solid #999;
        }
        table td.code {
            font-family: monospace;
        }
    </style>
</head>

<body>

<table>
    <thead>
    <tr>
        <th>Service Method</th>
        <th>Output</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${exampleData}" var="k,v">
        <tr>
            <td class="code">${k}</td>
            <td>${v}</td>
        </tr>
    </g:each>
    </tbody>
</table>

</body>
</html>