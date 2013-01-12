function getApplication() { 
	function createApp(){
		  var form = Ext.create('Ext.form.Panel', {
		        layout: 'absolute',
		        //url: 'save-form.php',
		        defaultType: 'textfield',
		        border: false,

		        items: [{
		            fieldLabel: 'Name',
		            fieldWidth: 60,
		            msgTarget: 'side',
		            allowBlank: false,
		            x: 5,
		            y: 5,
		            name: 'name',
		            anchor: '-5'  // anchor width by percentage
		        }, {
		            fieldLabel: 'Server',
		            fieldWidth: 60,
		            x: 5,
		            y: 35,
		            name: 'server',
		            anchor: '-5' // anchor width by percentage
		        }, {
					fieldLabel: 'Description',
					fieldWidth: 60,
		            x:5,
		            y: 65,
		            xtype: 'textareafield',
		            style: 'margin:0',
		            hideLabel: false,
		            name: 'description',
		            anchor: '-5 -5'  // anchor width and height
		        }]
		    });

		    var win = Ext.create('Ext.window.Window', {
		        title: 'Application Instance Registration',
		        width: 500,
		        height: 300,
		        minWidth: 300,
		        minHeight: 200,
		        layout: 'fit',
		        plain:true,
		        items: form,

				 buttons: [{
						text:'Register',
						handler: function() {
							this.up('form').getForm().isValid();
				
						 }              
					 },{
						 text: 'Close',
						 handler: function() {
							 win.close();
						}
					 }]
		    });

		    win.show();
	}
var myData = [
        ['Shanghai Server 01', 'Ubuntu', '12', '192.168.100.1','Online'],
        ['Hangzhou Server 01', 'Ubuntu', '11', '192.168.101.1','Restoring'],
        ['Shanghai Server 02', 'Ubuntu', '12', '192.168.100.2','Online']
    ];
	
	    // create the data store
    var store = Ext.create('Ext.data.ArrayStore', {
        fields: [
           {name: 'name'},
           {name: 'server_type'},
           {name: 'server_version'},
           {name: 'server_ip'},
           {name: 'monitor_status'}		 
        ],
        data: myData
    });


    
    return {
    	
        grid :  Ext.create('Ext.grid.Panel', {
            store: store,
            id: 'ai-panel',
            columns: [{
                header: 'Name',
                dataIndex: 'name',
    			width: 200,
    			align:'center'

            }, {
                header: 'Server Type',
                dataIndex: 'server_type',
                width: 200,
                sortable:false

            }, {
                header: 'Server Version',
                dataIndex: 'server_version',
                width: 200,
                align : 'left',
                sortable:false

            }, {
            
                header: 'Server IP',
                dataIndex: 'server_ip',             
                width: 200,
                sortable:false
            },{
    			 header: 'Monitor Status', 
    			 dataIndex:'monitor_status',
                 width:200, 
                 sortable :false, 
              }],
            renderTo: 'editor-grid',
            width: 600,
            height: 400,
    		viewConfig : {
    			forceFit : true
    		},
            title: 'Application Instances',
         //   frame: true,
            tbar: [{
                text: 'Register',
                icon:'statics/images/icons/fam/user_add.gif',
                handler:createApp
            }, {
                itemId: 'removeEmployee',
                text: 'Unregister',
                icon:'statics/images/icons/fam/user_delete.gif',
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