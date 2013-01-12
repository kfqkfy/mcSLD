function getTenant() { 
var myData = [
        ['OEC Computer', 'SU01', 6.0, '80%(10G)', 5,30,'Online'],
        ['Demo','SU03', 6.1, '10%(1.25G)', 10,280,'Restoring'],
        ['HiSoft','SU01', 7.0, '0%(20M)', 25,122,'Offline']
    ];
	
	    // create the data store
    var store = Ext.create('Ext.data.ArrayStore', {
        fields: [
           {name: 'name'},
           {name: 'Service Unit'},
           {name: 'Version', type: 'float'},
           {name: 'Storage'},
           {name: 'Active User',type:'float'},// type: 'date', dateFormat: 'n/j h:ia'
		   {name: 'Remaining Days', type: 'float'},
		   {name: 'Monitor Status'},
			 
        ],
        data: myData
    });

//    var rowEditing = Ext.create('Ext.grid.plugin.RowEditing', {
//        clicksToMoveEditor: 1,
//        autoCancel: false
//    });

    // create the grid and specify what field you want
    // to use for the editor at each column.
//    var grid = Ext.create('Ext.grid.Panel', {
//    	id: 'ten-panel',
//        store: store,
//        columns: [{
//            header: 'Name',
//            dataIndex: 'name',
//			width: 90,
//         /*   editor: {
//                // defaults to textfield if no xtype is supplied
//                allowBlank: false
//            }*/
//        }, {
//            header: 'Service Unit',
//            dataIndex: 'Service Unit',
//            width: 80,
// /*           editor: {
//                allowBlank: false,
//                vtype: 'email'
//            }*/
//        }, {
//           // xtype: 'datecolumn',
//            header: 'Version',
//            dataIndex: 'Version',
//            width: 80,
//     /*       editor: {
//                xtype: 'datefield',
//                allowBlank: false,
//                format: 'm/d/Y',
//                minValue: '01/01/2006',
//                minText: 'Cannot have a start date before the company existed!',
//                maxValue: Ext.Date.format(new Date(), 'm/d/Y')
//            }*/
//        }, {
//           // xtype: 'numbercolumn',
//            header: 'Storage',
//            dataIndex: 'Storage',
//           // format: '$0,0',
//            width: 90,
//         /*   editor: {
//                xtype: 'numberfield',
//                allowBlank: false,
//                minValue: 1,
//                maxValue: 150000
//            }*/
//        }, {
//           // xtype: 'checkcolumn',
//            header: 'Storage',
//            dataIndex: 'Storage',
//            width: 90,
//       /*     editor: {
//                xtype: 'checkbox',
//                cls: 'x-grid-checkheader-editor'
//            }*/
//        },{
//			    text     : 'Active User', 
//                width    : 85, 
//                sortable : true, 
//                dataIndex: 'Active User'
//            },
//			{
//                
//                text     : 'Remaining Days', 
//                width    : 85, 
//                sortable : true, 
//                dataIndex: 'Remaining Days'
//            },
//			{
//                text     : 'Monitor Status', 
//                width    : 85, 
//                sortable : true, 
//                dataIndex: 'Monitor Status'
//            }
//		
//		],
////        renderTo: 'editor-grid',
//        width: 600,
//        height: 400,
//        title: 'Tenants',
//        frame: true,
//        tbar: [{
//            text: 'New',
//            iconCls: 'employee-add',
//       /*     handler : function() {
//                rowEditing.cancelEdit();
//
//                // Create a model instance
//                var r = Ext.create('Employee', {
//                    name: 'New Guy',
//                    email: 'new@sencha-test.com',
//                    start: new Date(),
//                    salary: 50000,
//                    active: true
//                });
//
//                store.insert(0, r);
//                rowEditing.startEdit(0, 0);
//            }*/
//        }, {
//            text: 'Upgrade',
//            iconCls: 'employee-edit',
//			handler: function() {
//                var sm = grid.getSelectionModel();
//                rowEditing.cancelEdit();
//                store.remove(sm.getSelection());
//                if (store.getCount() > 0) {
//                    sm.select(0);
//                }
//            },
//			disabled: true
//       /*     handler : function() {
//                rowEditing.cancelEdit();
//
//                // Create a model instance
//                var r = Ext.create('Employee', {
//                    name: 'New Guy',
//                    email: 'new@sencha-test.com',
//                    start: new Date(),
//                    salary: 50000,
//                    active: true
//                });
//
//                store.insert(0, r);
//                rowEditing.startEdit(0, 0);
//            }*/
//        }, {
//            itemId: 'removeEmployee',
//            text: 'Delete',
//            iconCls: 'employee-remove',
//            handler: function() {
//                var sm = grid.getSelectionModel();
//                rowEditing.cancelEdit();
//                store.remove(sm.getSelection());
//                if (store.getCount() > 0) {
//                    sm.select(0);
//                }
//            },
//            disabled: true
//        }],
//       // plugins: [rowEditing],
//        listeners: {
//            'selectionchange': function(view, records) {
//                grid.down('#removeEmployee').setDisabled(!records.length);
//            }
//        }
//    });
    
    return {
    	
        grid :  Ext.create('Ext.grid.Panel', {
            store: store,
            id: 'ten-panel',
            columns: [{
                header: 'Name',
                dataIndex: 'name',
    			width: 90,
             /*   editor: {
                    // defaults to textfield if no xtype is supplied
                    allowBlank: false
                }*/
            }, {
                header: 'Service Unit',
                dataIndex: 'Service Unit',
                width: 80,
     /*           editor: {
                    allowBlank: false,
                    vtype: 'email'
                }*/
            }, {
               // xtype: 'datecolumn',
                header: 'Version',
                dataIndex: 'Version',
                width: 80,
         /*       editor: {
                    xtype: 'datefield',
                    allowBlank: false,
                    format: 'm/d/Y',
                    minValue: '01/01/2006',
                    minText: 'Cannot have a start date before the company existed!',
                    maxValue: Ext.Date.format(new Date(), 'm/d/Y')
                }*/
            }, {
               // xtype: 'numbercolumn',
                header: 'Storage',
                dataIndex: 'Storage',
               // format: '$0,0',
                width: 90,
             /*   editor: {
                    xtype: 'numberfield',
                    allowBlank: false,
                    minValue: 1,
                    maxValue: 150000
                }*/
            }, {
               // xtype: 'checkcolumn',
                header: 'Storage',
                dataIndex: 'Storage',
                width: 90,
           /*     editor: {
                    xtype: 'checkbox',
                    cls: 'x-grid-checkheader-editor'
                }*/
            },{
    			    text     : 'Active User', 
                    width    : 85, 
                    sortable : true, 
                    dataIndex: 'Active User'
                },
    			{
                    
                    text     : 'Remaining Days', 
                    width    : 85, 
                    sortable : true, 
                    dataIndex: 'Remaining Days'
                },
    			{
                    text     : 'Monitor Status', 
                    width    : 85, 
                    sortable : true, 
                    dataIndex: 'Monitor Status'
                }
    		
    		],
            renderTo: 'editor-grid',
            width: 600,
            height: 400,
            title: 'Tenants',
            frame: true,
            tbar: [{
                text: 'New',
                iconCls: 'employee-add',
           /*     handler : function() {
                    rowEditing.cancelEdit();

                    // Create a model instance
                    var r = Ext.create('Employee', {
                        name: 'New Guy',
                        email: 'new@sencha-test.com',
                        start: new Date(),
                        salary: 50000,
                        active: true
                    });

                    store.insert(0, r);
                    rowEditing.startEdit(0, 0);
                }*/
            }, {
                text: 'Upgrade',
                iconCls: 'employee-edit',
    			handler: function() {
                    var sm = grid.getSelectionModel();
                    rowEditing.cancelEdit();
                    store.remove(sm.getSelection());
                    if (store.getCount() > 0) {
                        sm.select(0);
                    }
                },
    			disabled: true
           /*     handler : function() {
                    rowEditing.cancelEdit();

                    // Create a model instance
                    var r = Ext.create('Employee', {
                        name: 'New Guy',
                        email: 'new@sencha-test.com',
                        start: new Date(),
                        salary: 50000,
                        active: true
                    });

                    store.insert(0, r);
                    rowEditing.startEdit(0, 0);
                }*/
            }, {
                itemId: 'removeEmployee',
                text: 'Delete',
                iconCls: 'employee-remove',
                handler: function() {
                    var sm = grid.getSelectionModel();
                    rowEditing.cancelEdit();
                    store.remove(sm.getSelection());
                    if (store.getCount() > 0) {
                        sm.select(0);
                    }
                },
                disabled: true
            }],
           // plugins: [rowEditing],
            listeners: {
                'selectionchange': function(view, records) {
                    this.down('#removeEmployee').setDisabled(!records.length);
                }
            }
        })
        
    	
    };
}