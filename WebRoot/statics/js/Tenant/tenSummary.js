Ext.onReady(function() {
    var form = Ext.create('Ext.form.Panel', {
        layout: 'absolute',
        border: false,

        items: [{
            x:5,
            y: 65,
            xtype: 'textarea',
            fieldLabel: 'Summary',
            style: 'margin:0',
            hideLabel: true,
            name: 'msg',
            anchor: '-5 -5'  // anchor width and height
        }]
    });

    var win = Ext.create('Ext.window.Window', {
        title: 'Tenant Creation Wizard',
        width: 500,
        height: 300,
        minWidth: 300,
        minHeight: 200,
        layout: 'fit',
        plain:true,
        items: form,

        buttons: [{
            text: 'Cancel'
        },{
            text: '< Back'
        },{
            text: 'Process >'
        }
        ]
    });

    win.show();
});